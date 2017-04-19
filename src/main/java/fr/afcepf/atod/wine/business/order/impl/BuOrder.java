
package fr.afcepf.atod.wine.business.order.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.atod.vin.data.exception.WineErrorCode;
import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.business.order.api.IBuOrder;
import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.OrderDetail;
import fr.afcepf.atod.wine.entity.Product;
import fr.afcepf.atod.ws.soap.shipping.Exception_Exception;
import fr.afcepf.atod.ws.soap.shipping.FollowOrder.DetailOrder;
import fr.afcepf.atod.ws.soap.shipping.ISoapShippingService;
import fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder;
import fr.afcepf.atod.ws.soap.shipping.SoapShippingServiceService;
import fr.afcepf.wine.paypal.CheckoutPaypal.DetailsPayment;
import fr.afcepf.wine.paypal.CheckoutPaypal.DetailsPayment.Entry;
import fr.afcepf.wine.paypal.ExpressCheckoutServiceService;
import fr.afcepf.wine.paypal.IExpressCheckout;
import fr.afcepf.wine.paypal.PayPalRESTException_Exception;
import fr.afcepf.wine.paypal.Payment;

/**
 * Classe pour les règles de gestion lié à un {@link Order}
 * dans l'application.
 * @author ronan - Metabeen
 */
@Service
public class BuOrder implements IBuOrder {
	/**
	 * Constante pour la quantité  initiale d'articles (1).
	 */
	private static final int QUANTITY_INIT = 1;
	/**
	 * Logger de log 4j pour les codes d'erreur.
	 */
	private Logger log = Logger.getLogger(BuOrder.class);
	/**
	 * Gestion de l'injection via Spring par
	 * l'annotation autowired. 
	 */
	@Autowired
	private IDaoOrder daoOrder;
	private IExpressCheckout proxy = null;
	private ISoapShippingService proxyShipping = null;
	private Payment paymentPaypal = null;
	private DecimalFormat df = new DecimalFormat("0.##");
	
	public static final String SEPARATOR_STR = "|";
	
	@Override
	public Order addItemCart(Order order, Product product) throws WineException {
		boolean itemFoundInCart  = false;
		if (order.getOrdersDetail()== null) {
			order.setOrdersDetail(new HashSet<OrderDetail>());
			insertNewOrderDetail(order, product);
		} else {
			for (OrderDetail od : order.getOrdersDetail()) {
				if (od.getProductOrdered().getIdProduct() == product.getIdProduct()) {
					od.setQuantite(od.getQuantite() + 1);
					itemFoundInCart = true;
				}
			}
			if (itemFoundInCart == false) {
				insertNewOrderDetail(order, product);
			}
		}
		return order;
	}
	/**
	 * Méthode privée pour l'ajout de détails d'une commande.
	 * @param order l'objet {@link Order}.
	 * @param product l'objet {@link Product}.
	 */
	private void insertNewOrderDetail(Order order, Product product) {
		order.getOrdersDetail().add(
				new OrderDetail(null,QUANTITY_INIT, order, product));
	}
	@Override
	public Order addNewOrder(Order order) throws WineException {
		daoOrder.insertObj(order);
		return order;
	}
	@Override
	public Order getLastOrderByCustomer(Customer customer) throws WineException {
		return daoOrder.getLastOrderByCustomer(customer);
	}
	
	/**
	 * ----------------------------------------------------
	 * PAYMENT PART - call ORCHESTRATOR WS
	 * ----------------------------------------------------
	 */
	

	/* (non-Javadoc)
	 * @see fr.afcepf.atod.wine.business.order.api.IBuOrder#checkoutPaypal(fr.afcepf.atod.wine.entity.Order)
	 */
	@Override
	public Order checkoutPaypal(Order order, double shipping, double total) throws WineException {
		WineException wineException = null;
		//setPaymentInfo to paypal
		proxy = new ExpressCheckoutServiceService().getExpressCheckoutServicePort();
		if (proxy != null) {
			DetailsPayment detailsPayment = new DetailsPayment();
			detailsPayment = setEntriesPaymentFromOrder(detailsPayment, order, shipping , total);
			try {
				paymentPaypal = proxy.checkoutPaypal(detailsPayment);
			} catch (PayPalRESTException_Exception e) {
				log.error(e);
			}
		} else {
			wineException = new WineException("payment can not be done correctly | dead proxy");
		}
		if (wineException != null) {
			throw wineException;
		}		
		return order;
	}

	/**
	 * @param detailsPayment {@link DetailsPayment}
	 * @param order {@link Order}
	 * @return {@link DetailsPayment}
	 */
	private DetailsPayment setEntriesPaymentFromOrder(DetailsPayment detailsPayment, Order order,
			double shipping, double total) {
		List<Entry> entries = new ArrayList<>();
		// create a list
		int temp = 1;
		if (order != null && order.getOrdersDetail() != null) {
			for (OrderDetail orderDetail : order.getOrdersDetail()) {
				double discount = calculDiscount(orderDetail);
				Entry entry = new Entry();
				entry.setKey(String.valueOf(temp));
				entry.setValue(orderDetail.getProductOrdered().getName() + "|"
						+ df.format(orderDetail.getProductOrdered().getPrice() - discount) + "|"
						+ String.valueOf(orderDetail.getQuantite()));
				entries.add(entry);
				temp++;
			}	
		} else {
			log.error("empty order | order has to be fulfil");
		}
		
		Entry entry = new Entry();
		entry.setKey("total");
		entry.setValue(df.format(total));
		entries.add(entry);
		
		entry = new Entry();
		entry.setKey("shipping");
		entry.setValue(String.valueOf(shipping));
		entries.add(entry);
		
		entry = new Entry();
		entry.setKey("idOrder");
		if (order != null) {
			entry.setValue(order.getId().toString());
		}
		entries.add(entry);
		
		detailsPayment.getEntry().addAll(entries);		
		return detailsPayment;
	}
	
	/**
	 * ----------------------------------------------------
	 *  SHIPPING PART - call ORCHESTRATOR WS
	 * ----------------------------------------------------
	 */
	
	
	/*
	 * (non-Javadoc)
	 * @see fr.afcepf.atod.wine.business.order.api.IBuOrder#checkoutShipping(fr.afcepf.atod.wine.entity.Order, double)
	 */
	
	@Override
	public Order checkoutShipping(Customer customer, Order order, double total) 
			throws WineException {
		WineException wineException = null;
		proxyShipping = new SoapShippingServiceService().getSoapShippingServicePort();
		DetailsOrder detailsOrder = new DetailsOrder();
		if (proxyShipping != null) {
			detailsOrder = setDetailOrderForShipping(detailsOrder, order, total);
			detailsOrder = addCustomerInfosForShipping(customer, detailsOrder);
			try {
				proxyShipping.setShipping(detailsOrder);
			} catch (Exception_Exception e) {
				log.error(e);
				wineException.setErreurVin(WineErrorCode.CA_NE_FONCTIONNE_PAS);
				wineException = new WineException(e.getMessage());
			}
		}
		if (wineException != null) {
			throw wineException;
		}
		return order;
	}	
		
	/**
	 * Set the order to a Map<string,string> in order
	 * to be sent to the SOAP WS
	 * @param detailsOrder {@link DetailsOrder}
	 * @param order {@link Order}
	 * @param total
	 * @return
	 */
	private DetailsOrder setDetailOrderForShipping(DetailsOrder detailsOrder, Order order,
			double total) {
		List<fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry> entries
			= new ArrayList<>();
		// create a list
		int temp = 1;
		if (order != null && order.getOrdersDetail() != null) {
			for (OrderDetail orderDetail : order.getOrdersDetail()) {
				double discount = calculDiscount(orderDetail);
				fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry entry 
				= new fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry();
				entry.setKey(String.valueOf(temp));
				entry.setValue(orderDetail.getProductOrdered().getName() + SEPARATOR_STR
						+ df.format(orderDetail.getProductOrdered().getPrice() - discount) + SEPARATOR_STR
						+ String.valueOf(orderDetail.getQuantite()));
				entries.add(entry);
				temp++;
			}	
		} else {
			log.error("empty order | order has to be fulfil");
		}
		fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry entry 
			= new fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry();
		entry.setKey("total");
		entry.setValue(df.format(total));
		entries.add(entry);
		
		entry = new fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry();
		entry.setKey("idOrder");
		if (order != null) {
			entry.setValue(order.getId().toString());
		}
		entries.add(entry);
		
		detailsOrder.getEntry().addAll(entries);
		return detailsOrder;
	}
	
	/**
	 * Add customer infos to the SOAP WS
	 * in order to choose packaging and shipping.
	 * @param customer {@link Customer}
	 * @param detailsOrder {@link DetailsOrder}
	 * @return
	 * @throws WineException {@link WineException}
	 */
	private DetailsOrder addCustomerInfosForShipping(Customer customer, 
			DetailsOrder detailsOrder) throws WineException {
		if (detailsOrder != null && !detailsOrder.getEntry().isEmpty()) {
			fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry entry 
				= new fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder.Entry();
			// addd customer infos to the wine app
			entry.setKey("customer");
			entry.setValue(customer.getFirstname() + SEPARATOR_STR + customer.getLastname()
					+ SEPARATOR_STR + customer.getAdress().getNumber() + SEPARATOR_STR
					+ customer.getAdress().getStreet() + SEPARATOR_STR
					+ customer.getAdress().getCity().getName() + SEPARATOR_STR
					+ customer.getAdress().getCity().getRegion().getCountry().getName());
			detailsOrder.getEntry().add(entry);
		} else {
			throw new WineException("empty order to send to the SOAP WS");
		}
		return detailsOrder;
	}
	
	/**
	 *
	 * @param orderDetail {@link OrderDetail}
	 * @return
	 */
	public double calculDiscount(OrderDetail orderDetail) {		 
		double discount = 0.0;
		double prix = 0.0;
		double pourcentage = 0.0;
		if (orderDetail != null
				&& orderDetail.getProductOrdered()
				.getSpeEvent()!= null) 
		{
			prix = orderDetail.getProductOrdered().getPrice();
			pourcentage = orderDetail.getProductOrdered()
					.getSpeEvent().getPourcentage();
			discount = prix/100 * pourcentage;
			
		}
		return discount;
	}
	
	public Payment getPaymentPaypal() {
		return paymentPaypal;
	}
	public void setPaymentPaypal(Payment paymentPaypal) {
		this.paymentPaypal = paymentPaypal;
	}
	
}

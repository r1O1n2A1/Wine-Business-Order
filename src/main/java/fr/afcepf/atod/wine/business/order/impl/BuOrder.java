
package fr.afcepf.atod.wine.business.order.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.business.order.api.IBuOrder;
import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.OrderDetail;
import fr.afcepf.atod.wine.entity.Product;
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
	private Payment paymentPaypal = null;
	private DecimalFormat df = new DecimalFormat("0.##");
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
		detailsPayment.getEntry().addAll(entries);
		return detailsPayment;
	}
	
	/**
	 *
	 * @param orderDetail
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.afcepf.atod.wine.business.order.impl;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.business.order.api.IBuOrder;
import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.data.order.impl.DaoOrder;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.OrderDetail;
import fr.afcepf.atod.wine.entity.Product;
import java.io.Serializable;
import java.util.HashSet;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ronan
 */
@Service
public class BuOrder implements IBuOrder {
    /**
     * Constante pour la quantit� initiale d'articles (1).
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
     * M�thode priv�e pour l'ajout de d�tails d'une commande.
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
	public Order getLastOrderByCustomer(Customer customer) {
		return daoOrder.getLastOrderByCustomer(customer);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.afcepf.atod.wine.business.order.api;

import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.entity.Customer;
import fr.afcepf.atod.wine.entity.Order;
import fr.afcepf.atod.wine.entity.Product;

/**
 * Interface pour les r�gles de gestion associ� �
 * la commande dans l'application.
 * @author ronan - metabeen
 */
public interface IBuOrder {
    /**
     * M�thode d'ajout de {@link Product} dans une {@link Order}.
     * @param order l'objet {@link Order} associ� au panier du client.
     * @param product l'objet {@link Product} associ� � l'ajout dans le panier.
     * @return un objet {@link Order} mis � jour.
     * @throws WineException 
     * <ul>
     * <li>L'objet ajout� dans le panier n'est plus disponible en stock.</li>
     * </ul>
     */
    Order addItemCart(Order order, Product product) throws WineException;
    /**
     * M�thode d'ajout d'un {@link Order} dans l'unit� de persistence.
     * @param order l'objet {@link Order} � ajouter.
     * @return l'objet {@link Order} ajout� dans la base. 
     * @throws WineException
     * <ul>
     * <li>L'unit� de persistence est indisponible.</li>
     * </ul>
     */
    Order addNewOrder(Order order) throws WineException; 
    /**
     * M�thoder permettant la r�cup�ration de la derni�re commande
     * du client.
     * @param customer le {@link Customer} dont on souhaite
     * r�cup�rer la {@link Order}.
     * @return un {@link Order} de l'unit� de persistence.
     */
    Order getLastOrderByCustomer(Customer customer); 
    
}


package fr.afcepf.atod.ws.soap.shipping;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISoapShippingService", targetNamespace = "shipping.soap.ws.atod.afcepf.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISoapShippingService {


    /**
     * 
     * @param idShipping
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "isExistingIdShipping", targetNamespace = "")
    @RequestWrapper(localName = "getIdShipping", targetNamespace = "shipping.soap.ws.atod.afcepf.fr", className = "fr.afcepf.atod.ws.soap.shipping.GetIdShipping")
    @ResponseWrapper(localName = "getIdShippingResponse", targetNamespace = "shipping.soap.ws.atod.afcepf.fr", className = "fr.afcepf.atod.ws.soap.shipping.GetIdShippingResponse")
    public boolean getIdShipping(
        @WebParam(name = "idShipping", targetNamespace = "")
        String idShipping)
        throws Exception_Exception
    ;

    /**
     * 
     * @param detailOrder
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "statusShippingOrder", targetNamespace = "")
    @RequestWrapper(localName = "followOrder", targetNamespace = "shipping.soap.ws.atod.afcepf.fr", className = "fr.afcepf.atod.ws.soap.shipping.FollowOrder")
    @ResponseWrapper(localName = "followOrderResponse", targetNamespace = "shipping.soap.ws.atod.afcepf.fr", className = "fr.afcepf.atod.ws.soap.shipping.FollowOrderResponse")
    public String followOrder(
        @WebParam(name = "detailOrder", targetNamespace = "")
        fr.afcepf.atod.ws.soap.shipping.FollowOrder.DetailOrder detailOrder);

    /**
     * 
     * @param detailsOrder
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "priceShipping", targetNamespace = "")
    @RequestWrapper(localName = "setShipping", targetNamespace = "shipping.soap.ws.atod.afcepf.fr", className = "fr.afcepf.atod.ws.soap.shipping.SetShipping")
    @ResponseWrapper(localName = "setShippingResponse", targetNamespace = "shipping.soap.ws.atod.afcepf.fr", className = "fr.afcepf.atod.ws.soap.shipping.SetShippingResponse")
    public String setShipping(
        @WebParam(name = "detailsOrder", targetNamespace = "")
        fr.afcepf.atod.ws.soap.shipping.SetShipping.DetailsOrder detailsOrder)
        throws Exception_Exception
    ;

}

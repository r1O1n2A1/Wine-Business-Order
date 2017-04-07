
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relatedResources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedResources">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="authorization" type="{http://paypal.wine.afcepf.fr}authorization" minOccurs="0"/>
 *         &lt;element name="capture" type="{http://paypal.wine.afcepf.fr}capture" minOccurs="0"/>
 *         &lt;element name="order" type="{http://paypal.wine.afcepf.fr}order" minOccurs="0"/>
 *         &lt;element name="refund" type="{http://paypal.wine.afcepf.fr}refund" minOccurs="0"/>
 *         &lt;element name="sale" type="{http://paypal.wine.afcepf.fr}sale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedResources", propOrder = {
    "authorization",
    "capture",
    "order",
    "refund",
    "sale"
})
public class RelatedResources
    extends PayPalModel
{

    protected Authorization authorization;
    protected Capture capture;
    protected Order order;
    protected Refund refund;
    protected Sale sale;

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link Authorization }
     *     
     */
    public Authorization getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorization }
     *     
     */
    public void setAuthorization(Authorization value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the capture property.
     * 
     * @return
     *     possible object is
     *     {@link Capture }
     *     
     */
    public Capture getCapture() {
        return capture;
    }

    /**
     * Sets the value of the capture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capture }
     *     
     */
    public void setCapture(Capture value) {
        this.capture = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Refund }
     *     
     */
    public Refund getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refund }
     *     
     */
    public void setRefund(Refund value) {
        this.refund = value;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    public Sale getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setSale(Sale value) {
        this.sale = value;
    }

}

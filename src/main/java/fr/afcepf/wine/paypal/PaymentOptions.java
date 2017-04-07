
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="allowedPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="skipFmf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentOptions", propOrder = {
    "allowedPaymentMethod",
    "recurringFlag",
    "skipFmf"
})
public class PaymentOptions
    extends PayPalModel
{

    protected String allowedPaymentMethod;
    protected Boolean recurringFlag;
    protected Boolean skipFmf;

    /**
     * Gets the value of the allowedPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedPaymentMethod() {
        return allowedPaymentMethod;
    }

    /**
     * Sets the value of the allowedPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedPaymentMethod(String value) {
        this.allowedPaymentMethod = value;
    }

    /**
     * Gets the value of the recurringFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurringFlag() {
        return recurringFlag;
    }

    /**
     * Sets the value of the recurringFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurringFlag(Boolean value) {
        this.recurringFlag = value;
    }

    /**
     * Gets the value of the skipFmf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipFmf() {
        return skipFmf;
    }

    /**
     * Sets the value of the skipFmf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipFmf(Boolean value) {
        this.skipFmf = value;
    }

}

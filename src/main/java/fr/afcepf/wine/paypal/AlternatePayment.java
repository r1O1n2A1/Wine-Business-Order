
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alternatePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alternatePayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="alternatePaymentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternatePaymentProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alternatePayment", propOrder = {
    "alternatePaymentAccountId",
    "alternatePaymentProviderId",
    "externalCustomerId"
})
public class AlternatePayment
    extends PayPalModel
{

    protected String alternatePaymentAccountId;
    protected String alternatePaymentProviderId;
    protected String externalCustomerId;

    /**
     * Gets the value of the alternatePaymentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePaymentAccountId() {
        return alternatePaymentAccountId;
    }

    /**
     * Sets the value of the alternatePaymentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePaymentAccountId(String value) {
        this.alternatePaymentAccountId = value;
    }

    /**
     * Gets the value of the alternatePaymentProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePaymentProviderId() {
        return alternatePaymentProviderId;
    }

    /**
     * Sets the value of the alternatePaymentProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePaymentProviderId(String value) {
        this.alternatePaymentProviderId = value;
    }

    /**
     * Gets the value of the externalCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCustomerId() {
        return externalCustomerId;
    }

    /**
     * Sets the value of the externalCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCustomerId(String value) {
        this.externalCustomerId = value;
    }

}

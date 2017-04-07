
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extendedBankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extendedBankAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}bankAccount">
 *       &lt;sequence>
 *         &lt;element name="mandateReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendedBankAccount", propOrder = {
    "mandateReferenceNumber"
})
public class ExtendedBankAccount
    extends BankAccount
{

    protected String mandateReferenceNumber;

    /**
     * Gets the value of the mandateReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateReferenceNumber() {
        return mandateReferenceNumber;
    }

    /**
     * Sets the value of the mandateReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateReferenceNumber(String value) {
        this.mandateReferenceNumber = value;
    }

}

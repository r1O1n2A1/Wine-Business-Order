
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for installmentOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="installmentOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="discountAmount" type="{http://paypal.wine.afcepf.fr}currency" minOccurs="0"/>
 *         &lt;element name="discountPercentage" type="{http://paypal.wine.afcepf.fr}percentage" minOccurs="0"/>
 *         &lt;element name="monthlyPayment" type="{http://paypal.wine.afcepf.fr}currency" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "installmentOption", propOrder = {
    "discountAmount",
    "discountPercentage",
    "monthlyPayment",
    "term"
})
public class InstallmentOption
    extends PayPalModel
{

    protected Currency discountAmount;
    protected Percentage discountPercentage;
    protected Currency monthlyPayment;
    protected int term;

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDiscountAmount(Currency value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Percentage }
     *     
     */
    public Percentage getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Percentage }
     *     
     */
    public void setDiscountPercentage(Percentage value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the monthlyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * Sets the value of the monthlyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setMonthlyPayment(Currency value) {
        this.monthlyPayment = value;
    }

    /**
     * Gets the value of the term property.
     * 
     */
    public int getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     */
    public void setTerm(int value) {
        this.term = value;
    }

}

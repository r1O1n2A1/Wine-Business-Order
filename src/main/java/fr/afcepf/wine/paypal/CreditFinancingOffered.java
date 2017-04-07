
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditFinancingOffered complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditFinancingOffered">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="cartAmountImmutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="monthlyPayment" type="{http://paypal.wine.afcepf.fr}currency" minOccurs="0"/>
 *         &lt;element name="payerAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="totalCost" type="{http://paypal.wine.afcepf.fr}currency" minOccurs="0"/>
 *         &lt;element name="totalInterest" type="{http://paypal.wine.afcepf.fr}currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditFinancingOffered", propOrder = {
    "cartAmountImmutable",
    "monthlyPayment",
    "payerAcceptance",
    "term",
    "totalCost",
    "totalInterest"
})
public class CreditFinancingOffered
    extends PayPalModel
{

    protected Boolean cartAmountImmutable;
    protected Currency monthlyPayment;
    protected Boolean payerAcceptance;
    protected float term;
    protected Currency totalCost;
    protected Currency totalInterest;

    /**
     * Gets the value of the cartAmountImmutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCartAmountImmutable() {
        return cartAmountImmutable;
    }

    /**
     * Sets the value of the cartAmountImmutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCartAmountImmutable(Boolean value) {
        this.cartAmountImmutable = value;
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
     * Gets the value of the payerAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayerAcceptance() {
        return payerAcceptance;
    }

    /**
     * Sets the value of the payerAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayerAcceptance(Boolean value) {
        this.payerAcceptance = value;
    }

    /**
     * Gets the value of the term property.
     * 
     */
    public float getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     */
    public void setTerm(float value) {
        this.term = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotalCost(Currency value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the totalInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotalInterest() {
        return totalInterest;
    }

    /**
     * Sets the value of the totalInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotalInterest(Currency value) {
        this.totalInterest = value;
    }

}

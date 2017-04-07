
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fundingInstrument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fundingInstrument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="alternatePayment" type="{http://paypal.wine.afcepf.fr}alternatePayment" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://paypal.wine.afcepf.fr}extendedBankAccount" minOccurs="0"/>
 *         &lt;element name="bankAccountToken" type="{http://paypal.wine.afcepf.fr}bankToken" minOccurs="0"/>
 *         &lt;element name="billing" type="{http://paypal.wine.afcepf.fr}billing" minOccurs="0"/>
 *         &lt;element name="carrierAccount" type="{http://paypal.wine.afcepf.fr}carrierAccount" minOccurs="0"/>
 *         &lt;element name="carrierAccountToken" type="{http://paypal.wine.afcepf.fr}carrierAccountToken" minOccurs="0"/>
 *         &lt;element name="credit" type="{http://paypal.wine.afcepf.fr}credit" minOccurs="0"/>
 *         &lt;element name="creditCard" type="{http://paypal.wine.afcepf.fr}creditCard" minOccurs="0"/>
 *         &lt;element name="creditCardToken" type="{http://paypal.wine.afcepf.fr}creditCardToken" minOccurs="0"/>
 *         &lt;element name="externalFunding" type="{http://paypal.wine.afcepf.fr}externalFunding" minOccurs="0"/>
 *         &lt;element name="incentive" type="{http://paypal.wine.afcepf.fr}incentive" minOccurs="0"/>
 *         &lt;element name="paymentCard" type="{http://paypal.wine.afcepf.fr}paymentCard" minOccurs="0"/>
 *         &lt;element name="privateLabelCard" type="{http://paypal.wine.afcepf.fr}privateLabelCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundingInstrument", propOrder = {
    "alternatePayment",
    "bankAccount",
    "bankAccountToken",
    "billing",
    "carrierAccount",
    "carrierAccountToken",
    "credit",
    "creditCard",
    "creditCardToken",
    "externalFunding",
    "incentive",
    "paymentCard",
    "privateLabelCard"
})
public class FundingInstrument
    extends PayPalModel
{

    protected AlternatePayment alternatePayment;
    protected ExtendedBankAccount bankAccount;
    protected BankToken bankAccountToken;
    protected Billing billing;
    protected CarrierAccount carrierAccount;
    protected CarrierAccountToken carrierAccountToken;
    protected Credit credit;
    protected CreditCard creditCard;
    protected CreditCardToken creditCardToken;
    protected ExternalFunding externalFunding;
    protected Incentive incentive;
    protected PaymentCard paymentCard;
    protected PrivateLabelCard privateLabelCard;

    /**
     * Gets the value of the alternatePayment property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePayment }
     *     
     */
    public AlternatePayment getAlternatePayment() {
        return alternatePayment;
    }

    /**
     * Sets the value of the alternatePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePayment }
     *     
     */
    public void setAlternatePayment(AlternatePayment value) {
        this.alternatePayment = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedBankAccount }
     *     
     */
    public ExtendedBankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedBankAccount }
     *     
     */
    public void setBankAccount(ExtendedBankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bankAccountToken property.
     * 
     * @return
     *     possible object is
     *     {@link BankToken }
     *     
     */
    public BankToken getBankAccountToken() {
        return bankAccountToken;
    }

    /**
     * Sets the value of the bankAccountToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToken }
     *     
     */
    public void setBankAccountToken(BankToken value) {
        this.bankAccountToken = value;
    }

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link Billing }
     *     
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Billing }
     *     
     */
    public void setBilling(Billing value) {
        this.billing = value;
    }

    /**
     * Gets the value of the carrierAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAccount }
     *     
     */
    public CarrierAccount getCarrierAccount() {
        return carrierAccount;
    }

    /**
     * Sets the value of the carrierAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAccount }
     *     
     */
    public void setCarrierAccount(CarrierAccount value) {
        this.carrierAccount = value;
    }

    /**
     * Gets the value of the carrierAccountToken property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAccountToken }
     *     
     */
    public CarrierAccountToken getCarrierAccountToken() {
        return carrierAccountToken;
    }

    /**
     * Sets the value of the carrierAccountToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAccountToken }
     *     
     */
    public void setCarrierAccountToken(CarrierAccountToken value) {
        this.carrierAccountToken = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Credit }
     *     
     */
    public Credit getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credit }
     *     
     */
    public void setCredit(Credit value) {
        this.credit = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the creditCardToken property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardToken }
     *     
     */
    public CreditCardToken getCreditCardToken() {
        return creditCardToken;
    }

    /**
     * Sets the value of the creditCardToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardToken }
     *     
     */
    public void setCreditCardToken(CreditCardToken value) {
        this.creditCardToken = value;
    }

    /**
     * Gets the value of the externalFunding property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFunding }
     *     
     */
    public ExternalFunding getExternalFunding() {
        return externalFunding;
    }

    /**
     * Sets the value of the externalFunding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFunding }
     *     
     */
    public void setExternalFunding(ExternalFunding value) {
        this.externalFunding = value;
    }

    /**
     * Gets the value of the incentive property.
     * 
     * @return
     *     possible object is
     *     {@link Incentive }
     *     
     */
    public Incentive getIncentive() {
        return incentive;
    }

    /**
     * Sets the value of the incentive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incentive }
     *     
     */
    public void setIncentive(Incentive value) {
        this.incentive = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setPaymentCard(PaymentCard value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the privateLabelCard property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateLabelCard }
     *     
     */
    public PrivateLabelCard getPrivateLabelCard() {
        return privateLabelCard;
    }

    /**
     * Sets the value of the privateLabelCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateLabelCard }
     *     
     */
    public void setPrivateLabelCard(PrivateLabelCard value) {
        this.privateLabelCard = value;
    }

}

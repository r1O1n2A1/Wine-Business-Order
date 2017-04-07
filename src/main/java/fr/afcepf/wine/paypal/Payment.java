
package fr.afcepf.wine.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalResource">
 *       &lt;sequence>
 *         &lt;element name="billingAgreementTokens" type="{http://paypal.wine.afcepf.fr}billingAgreementToken" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditFinancingOffered" type="{http://paypal.wine.afcepf.fr}creditFinancingOffered" minOccurs="0"/>
 *         &lt;element name="experienceProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedTransactions" type="{http://paypal.wine.afcepf.fr}error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="failureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="links" type="{http://paypal.wine.afcepf.fr}links" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noteToPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payee" type="{http://paypal.wine.afcepf.fr}payee" minOccurs="0"/>
 *         &lt;element name="payer" type="{http://paypal.wine.afcepf.fr}payer" minOccurs="0"/>
 *         &lt;element name="paymentInstruction" type="{http://paypal.wine.afcepf.fr}paymentInstruction" minOccurs="0"/>
 *         &lt;element name="potentialPayerInfo" type="{http://paypal.wine.afcepf.fr}potentialPayerInfo" minOccurs="0"/>
 *         &lt;element name="redirectUrls" type="{http://paypal.wine.afcepf.fr}redirectUrls" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactions" type="{http://paypal.wine.afcepf.fr}transaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "billingAgreementTokens",
    "cart",
    "createTime",
    "creditFinancingOffered",
    "experienceProfileId",
    "failedTransactions",
    "failureReason",
    "id",
    "intent",
    "links",
    "noteToPayer",
    "payee",
    "payer",
    "paymentInstruction",
    "potentialPayerInfo",
    "redirectUrls",
    "state",
    "transactions",
    "updateTime"
})
public class Payment
    extends PayPalResource
{

    @XmlElement(nillable = true)
    protected List<BillingAgreementToken> billingAgreementTokens;
    protected String cart;
    protected String createTime;
    protected CreditFinancingOffered creditFinancingOffered;
    protected String experienceProfileId;
    @XmlElement(nillable = true)
    protected List<Error> failedTransactions;
    protected String failureReason;
    protected String id;
    protected String intent;
    @XmlElement(nillable = true)
    protected List<Links> links;
    protected String noteToPayer;
    protected Payee payee;
    protected Payer payer;
    protected PaymentInstruction paymentInstruction;
    protected PotentialPayerInfo potentialPayerInfo;
    protected RedirectUrls redirectUrls;
    protected String state;
    @XmlElement(nillable = true)
    protected List<Transaction> transactions;
    protected String updateTime;

    /**
     * Gets the value of the billingAgreementTokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingAgreementTokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingAgreementTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingAgreementToken }
     * 
     * 
     */
    public List<BillingAgreementToken> getBillingAgreementTokens() {
        if (billingAgreementTokens == null) {
            billingAgreementTokens = new ArrayList<BillingAgreementToken>();
        }
        return this.billingAgreementTokens;
    }

    /**
     * Gets the value of the cart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCart() {
        return cart;
    }

    /**
     * Sets the value of the cart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCart(String value) {
        this.cart = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the creditFinancingOffered property.
     * 
     * @return
     *     possible object is
     *     {@link CreditFinancingOffered }
     *     
     */
    public CreditFinancingOffered getCreditFinancingOffered() {
        return creditFinancingOffered;
    }

    /**
     * Sets the value of the creditFinancingOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditFinancingOffered }
     *     
     */
    public void setCreditFinancingOffered(CreditFinancingOffered value) {
        this.creditFinancingOffered = value;
    }

    /**
     * Gets the value of the experienceProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperienceProfileId() {
        return experienceProfileId;
    }

    /**
     * Sets the value of the experienceProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperienceProfileId(String value) {
        this.experienceProfileId = value;
    }

    /**
     * Gets the value of the failedTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failedTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailedTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getFailedTransactions() {
        if (failedTransactions == null) {
            failedTransactions = new ArrayList<Error>();
        }
        return this.failedTransactions;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReason(String value) {
        this.failureReason = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntent(String value) {
        this.intent = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Links }
     * 
     * 
     */
    public List<Links> getLinks() {
        if (links == null) {
            links = new ArrayList<Links>();
        }
        return this.links;
    }

    /**
     * Gets the value of the noteToPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Sets the value of the noteToPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayer(String value) {
        this.noteToPayer = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Payee }
     *     
     */
    public Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee }
     *     
     */
    public void setPayee(Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link Payer }
     *     
     */
    public Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payer }
     *     
     */
    public void setPayer(Payer value) {
        this.payer = value;
    }

    /**
     * Gets the value of the paymentInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction }
     *     
     */
    public PaymentInstruction getPaymentInstruction() {
        return paymentInstruction;
    }

    /**
     * Sets the value of the paymentInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction }
     *     
     */
    public void setPaymentInstruction(PaymentInstruction value) {
        this.paymentInstruction = value;
    }

    /**
     * Gets the value of the potentialPayerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PotentialPayerInfo }
     *     
     */
    public PotentialPayerInfo getPotentialPayerInfo() {
        return potentialPayerInfo;
    }

    /**
     * Sets the value of the potentialPayerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialPayerInfo }
     *     
     */
    public void setPotentialPayerInfo(PotentialPayerInfo value) {
        this.potentialPayerInfo = value;
    }

    /**
     * Gets the value of the redirectUrls property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectUrls }
     *     
     */
    public RedirectUrls getRedirectUrls() {
        return redirectUrls;
    }

    /**
     * Sets the value of the redirectUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectUrls }
     *     
     */
    public void setRedirectUrls(RedirectUrls value) {
        this.redirectUrls = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<Transaction>();
        }
        return this.transactions;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

}

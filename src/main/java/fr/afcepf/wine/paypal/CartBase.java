
package fr.afcepf.wine.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cartBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://paypal.wine.afcepf.fr}amount" minOccurs="0"/>
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalFunding" type="{http://paypal.wine.afcepf.fr}externalFunding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemList" type="{http://paypal.wine.afcepf.fr}itemList" minOccurs="0"/>
 *         &lt;element name="noteToPayee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payee" type="{http://paypal.wine.afcepf.fr}payee" minOccurs="0"/>
 *         &lt;element name="paymentOptions" type="{http://paypal.wine.afcepf.fr}paymentOptions" minOccurs="0"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softDescriptorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartBase", propOrder = {
    "amount",
    "custom",
    "description",
    "externalFunding",
    "invoiceNumber",
    "itemList",
    "noteToPayee",
    "notifyUrl",
    "orderUrl",
    "payee",
    "paymentOptions",
    "referenceId",
    "softDescriptor",
    "softDescriptorCity"
})
@XmlSeeAlso({
    TransactionBase.class
})
public class CartBase
    extends PayPalModel
{

    protected Amount amount;
    protected String custom;
    protected String description;
    @XmlElement(nillable = true)
    protected List<ExternalFunding> externalFunding;
    protected String invoiceNumber;
    protected ItemList itemList;
    protected String noteToPayee;
    protected String notifyUrl;
    protected String orderUrl;
    protected Payee payee;
    protected PaymentOptions paymentOptions;
    protected String referenceId;
    protected String softDescriptor;
    protected String softDescriptorCity;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the externalFunding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalFunding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalFunding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalFunding }
     * 
     * 
     */
    public List<ExternalFunding> getExternalFunding() {
        if (externalFunding == null) {
            externalFunding = new ArrayList<ExternalFunding>();
        }
        return this.externalFunding;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setItemList(ItemList value) {
        this.itemList = value;
    }

    /**
     * Gets the value of the noteToPayee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayee() {
        return noteToPayee;
    }

    /**
     * Sets the value of the noteToPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayee(String value) {
        this.noteToPayee = value;
    }

    /**
     * Gets the value of the notifyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets the value of the notifyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyUrl(String value) {
        this.notifyUrl = value;
    }

    /**
     * Gets the value of the orderUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderUrl() {
        return orderUrl;
    }

    /**
     * Sets the value of the orderUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderUrl(String value) {
        this.orderUrl = value;
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
     * Gets the value of the paymentOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOptions }
     *     
     */
    public PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * Sets the value of the paymentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptions }
     *     
     */
    public void setPaymentOptions(PaymentOptions value) {
        this.paymentOptions = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the softDescriptorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptorCity() {
        return softDescriptorCity;
    }

    /**
     * Sets the value of the softDescriptorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptorCity(String value) {
        this.softDescriptorCity = value;
    }

}

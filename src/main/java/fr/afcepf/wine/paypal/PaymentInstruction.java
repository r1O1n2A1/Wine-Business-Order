
package fr.afcepf.wine.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentInstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalResource">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://paypal.wine.afcepf.fr}currency" minOccurs="0"/>
 *         &lt;element name="instructionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="links" type="{http://paypal.wine.afcepf.fr}links" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientBankingInstruction" type="{http://paypal.wine.afcepf.fr}recipientBankingInstruction" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentInstruction", propOrder = {
    "amount",
    "instructionType",
    "links",
    "note",
    "paymentDueDate",
    "recipientBankingInstruction",
    "referenceNumber"
})
public class PaymentInstruction
    extends PayPalResource
{

    protected Currency amount;
    protected String instructionType;
    @XmlElement(nillable = true)
    protected List<Links> links;
    protected String note;
    protected String paymentDueDate;
    protected RecipientBankingInstruction recipientBankingInstruction;
    protected String referenceNumber;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setAmount(Currency value) {
        this.amount = value;
    }

    /**
     * Gets the value of the instructionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionType() {
        return instructionType;
    }

    /**
     * Sets the value of the instructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionType(String value) {
        this.instructionType = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDueDate(String value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the recipientBankingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientBankingInstruction }
     *     
     */
    public RecipientBankingInstruction getRecipientBankingInstruction() {
        return recipientBankingInstruction;
    }

    /**
     * Sets the value of the recipientBankingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientBankingInstruction }
     *     
     */
    public void setRecipientBankingInstruction(RecipientBankingInstruction value) {
        this.recipientBankingInstruction = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

}


package fr.afcepf.wine.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="accountAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalSelectedFundingInstrumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingInstruments" type="{http://paypal.wine.afcepf.fr}fundingInstrument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fundingOption" type="{http://paypal.wine.afcepf.fr}fundingOption" minOccurs="0"/>
 *         &lt;element name="fundingOptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerInfo" type="{http://paypal.wine.afcepf.fr}payerInfo" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedFundingOption" type="{http://paypal.wine.afcepf.fr}fundingOption" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payer", propOrder = {
    "accountAge",
    "accountType",
    "externalSelectedFundingInstrumentType",
    "fundingInstruments",
    "fundingOption",
    "fundingOptionId",
    "payerInfo",
    "paymentMethod",
    "relatedFundingOption",
    "status"
})
public class Payer
    extends PayPalModel
{

    protected String accountAge;
    protected String accountType;
    protected String externalSelectedFundingInstrumentType;
    @XmlElement(nillable = true)
    protected List<FundingInstrument> fundingInstruments;
    protected FundingOption fundingOption;
    protected String fundingOptionId;
    protected PayerInfo payerInfo;
    protected String paymentMethod;
    protected FundingOption relatedFundingOption;
    protected String status;

    /**
     * Gets the value of the accountAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAge() {
        return accountAge;
    }

    /**
     * Sets the value of the accountAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAge(String value) {
        this.accountAge = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the externalSelectedFundingInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSelectedFundingInstrumentType() {
        return externalSelectedFundingInstrumentType;
    }

    /**
     * Sets the value of the externalSelectedFundingInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSelectedFundingInstrumentType(String value) {
        this.externalSelectedFundingInstrumentType = value;
    }

    /**
     * Gets the value of the fundingInstruments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingInstruments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingInstruments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingInstrument }
     * 
     * 
     */
    public List<FundingInstrument> getFundingInstruments() {
        if (fundingInstruments == null) {
            fundingInstruments = new ArrayList<FundingInstrument>();
        }
        return this.fundingInstruments;
    }

    /**
     * Gets the value of the fundingOption property.
     * 
     * @return
     *     possible object is
     *     {@link FundingOption }
     *     
     */
    public FundingOption getFundingOption() {
        return fundingOption;
    }

    /**
     * Sets the value of the fundingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingOption }
     *     
     */
    public void setFundingOption(FundingOption value) {
        this.fundingOption = value;
    }

    /**
     * Gets the value of the fundingOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingOptionId() {
        return fundingOptionId;
    }

    /**
     * Sets the value of the fundingOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingOptionId(String value) {
        this.fundingOptionId = value;
    }

    /**
     * Gets the value of the payerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayerInfo }
     *     
     */
    public PayerInfo getPayerInfo() {
        return payerInfo;
    }

    /**
     * Sets the value of the payerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerInfo }
     *     
     */
    public void setPayerInfo(PayerInfo value) {
        this.payerInfo = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the relatedFundingOption property.
     * 
     * @return
     *     possible object is
     *     {@link FundingOption }
     *     
     */
    public FundingOption getRelatedFundingOption() {
        return relatedFundingOption;
    }

    /**
     * Sets the value of the relatedFundingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingOption }
     *     
     */
    public void setRelatedFundingOption(FundingOption value) {
        this.relatedFundingOption = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}

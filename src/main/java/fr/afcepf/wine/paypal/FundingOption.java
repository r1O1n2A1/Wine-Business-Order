
package fr.afcepf.wine.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fundingOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fundingOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="backupFundingInstrument" type="{http://paypal.wine.afcepf.fr}fundingInstrument" minOccurs="0"/>
 *         &lt;element name="currencyConversion" type="{http://paypal.wine.afcepf.fr}currencyConversion" minOccurs="0"/>
 *         &lt;element name="fundingSources" type="{http://paypal.wine.afcepf.fr}fundingSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installmentInfo" type="{http://paypal.wine.afcepf.fr}installmentInfo" minOccurs="0"/>
 *         &lt;element name="links" type="{http://paypal.wine.afcepf.fr}definitionsLinkdescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundingOption", propOrder = {
    "backupFundingInstrument",
    "currencyConversion",
    "fundingSources",
    "id",
    "installmentInfo",
    "links"
})
public class FundingOption
    extends PayPalModel
{

    protected FundingInstrument backupFundingInstrument;
    protected CurrencyConversion currencyConversion;
    @XmlElement(nillable = true)
    protected List<FundingSource> fundingSources;
    protected String id;
    protected InstallmentInfo installmentInfo;
    @XmlElement(nillable = true)
    protected List<DefinitionsLinkdescription> links;

    /**
     * Gets the value of the backupFundingInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link FundingInstrument }
     *     
     */
    public FundingInstrument getBackupFundingInstrument() {
        return backupFundingInstrument;
    }

    /**
     * Sets the value of the backupFundingInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingInstrument }
     *     
     */
    public void setBackupFundingInstrument(FundingInstrument value) {
        this.backupFundingInstrument = value;
    }

    /**
     * Gets the value of the currencyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion }
     *     
     */
    public CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }

    /**
     * Sets the value of the currencyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion }
     *     
     */
    public void setCurrencyConversion(CurrencyConversion value) {
        this.currencyConversion = value;
    }

    /**
     * Gets the value of the fundingSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSource }
     * 
     * 
     */
    public List<FundingSource> getFundingSources() {
        if (fundingSources == null) {
            fundingSources = new ArrayList<FundingSource>();
        }
        return this.fundingSources;
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
     * Gets the value of the installmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentInfo }
     *     
     */
    public InstallmentInfo getInstallmentInfo() {
        return installmentInfo;
    }

    /**
     * Sets the value of the installmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentInfo }
     *     
     */
    public void setInstallmentInfo(InstallmentInfo value) {
        this.installmentInfo = value;
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
     * {@link DefinitionsLinkdescription }
     * 
     * 
     */
    public List<DefinitionsLinkdescription> getLinks() {
        if (links == null) {
            links = new ArrayList<DefinitionsLinkdescription>();
        }
        return this.links;
    }

}


package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="billingAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedInstallmentOption" type="{http://paypal.wine.afcepf.fr}installmentOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing", propOrder = {
    "billingAgreementId",
    "selectedInstallmentOption"
})
public class Billing
    extends PayPalModel
{

    protected String billingAgreementId;
    protected InstallmentOption selectedInstallmentOption;

    /**
     * Gets the value of the billingAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    /**
     * Sets the value of the billingAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgreementId(String value) {
        this.billingAgreementId = value;
    }

    /**
     * Gets the value of the selectedInstallmentOption property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentOption }
     *     
     */
    public InstallmentOption getSelectedInstallmentOption() {
        return selectedInstallmentOption;
    }

    /**
     * Sets the value of the selectedInstallmentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentOption }
     *     
     */
    public void setSelectedInstallmentOption(InstallmentOption value) {
        this.selectedInstallmentOption = value;
    }

}

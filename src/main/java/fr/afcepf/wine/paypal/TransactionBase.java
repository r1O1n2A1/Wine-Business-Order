
package fr.afcepf.wine.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}cartBase">
 *       &lt;sequence>
 *         &lt;element name="purchaseUnitReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedResources" type="{http://paypal.wine.afcepf.fr}relatedResources" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionBase", propOrder = {
    "purchaseUnitReferenceId",
    "relatedResources"
})
@XmlSeeAlso({
    Transaction.class
})
public class TransactionBase
    extends CartBase
{

    protected String purchaseUnitReferenceId;
    @XmlElement(nillable = true)
    protected List<RelatedResources> relatedResources;

    /**
     * Gets the value of the purchaseUnitReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseUnitReferenceId() {
        return purchaseUnitReferenceId;
    }

    /**
     * Sets the value of the purchaseUnitReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseUnitReferenceId(String value) {
        this.purchaseUnitReferenceId = value;
    }

    /**
     * Gets the value of the relatedResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedResources }
     * 
     * 
     */
    public List<RelatedResources> getRelatedResources() {
        if (relatedResources == null) {
            relatedResources = new ArrayList<RelatedResources>();
        }
        return this.relatedResources;
    }

}

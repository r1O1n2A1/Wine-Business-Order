
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for links complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="links">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="enctype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schema" type="{http://paypal.wine.afcepf.fr}hyperSchema" minOccurs="0"/>
 *         &lt;element name="targetSchema" type="{http://paypal.wine.afcepf.fr}hyperSchema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "links", propOrder = {
    "enctype",
    "href",
    "method",
    "rel",
    "schema",
    "targetSchema"
})
public class Links
    extends PayPalModel
{

    protected String enctype;
    protected String href;
    protected String method;
    protected String rel;
    protected HyperSchema schema;
    protected HyperSchema targetSchema;

    /**
     * Gets the value of the enctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnctype() {
        return enctype;
    }

    /**
     * Sets the value of the enctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnctype(String value) {
        this.enctype = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the rel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRel() {
        return rel;
    }

    /**
     * Sets the value of the rel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRel(String value) {
        this.rel = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link HyperSchema }
     *     
     */
    public HyperSchema getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperSchema }
     *     
     */
    public void setSchema(HyperSchema value) {
        this.schema = value;
    }

    /**
     * Gets the value of the targetSchema property.
     * 
     * @return
     *     possible object is
     *     {@link HyperSchema }
     *     
     */
    public HyperSchema getTargetSchema() {
        return targetSchema;
    }

    /**
     * Sets the value of the targetSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperSchema }
     *     
     */
    public void setTargetSchema(HyperSchema value) {
        this.targetSchema = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.22 at 12:14:34 AM CEST 
//


package xmlweb.agent.soap.models.accomodation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccomodationSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccomodationSOAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accomodation_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accomodation_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capacity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="category">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accomodation_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="location_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccomodationSOAP", propOrder = {
    "accomodationId",
    "accomodationName",
    "capacity",
    "category",
    "accomodationType",
    "version",
    "locationId"
})
public class AccomodationSOAP {

    @XmlElement(name = "accomodation_id")
    protected long accomodationId;
    @XmlElement(name = "accomodation_name", required = true)
    protected String accomodationName;
    protected int capacity;
    protected int category;
    @XmlElement(name = "accomodation_type", required = true)
    protected String accomodationType;
    protected long version;
    @XmlElement(name = "location_id")
    protected long locationId;

    /**
     * Gets the value of the accomodationId property.
     * 
     */
    public long getAccomodationId() {
        return accomodationId;
    }

    /**
     * Sets the value of the accomodationId property.
     * 
     */
    public void setAccomodationId(long value) {
        this.accomodationId = value;
    }

    /**
     * Gets the value of the accomodationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccomodationName() {
        return accomodationName;
    }

    /**
     * Sets the value of the accomodationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccomodationName(String value) {
        this.accomodationName = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the category property.
     * 
     */
    public int getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(int value) {
        this.category = value;
    }

    /**
     * Gets the value of the accomodationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccomodationType() {
        return accomodationType;
    }

    /**
     * Sets the value of the accomodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccomodationType(String value) {
        this.accomodationType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(long value) {
        this.locationId = value;
    }

}

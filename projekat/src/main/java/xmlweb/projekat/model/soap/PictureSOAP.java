//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.15 at 04:38:59 PM CEST 
//


package xmlweb.projekat.model.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureSOAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="picture_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="entity_version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accomodation_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
@XmlType(name = "PictureSOAP", propOrder = {
    "pictureId",
    "content",
    "entityVersion",
    "accomodationId"
})
public class PictureSOAP {

    @XmlElement(name = "picture_id")
    protected int pictureId;
    @XmlElement(required = true)
    protected byte[] content;
    @XmlElement(name = "entity_version")
    protected int entityVersion;
    @XmlElement(name = "accomodation_id")
    protected int accomodationId;

    /**
     * Gets the value of the pictureId property.
     * 
     */
    public int getPictureId() {
        return pictureId;
    }

    /**
     * Sets the value of the pictureId property.
     * 
     */
    public void setPictureId(int value) {
        this.pictureId = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the entityVersion property.
     * 
     */
    public int getEntityVersion() {
        return entityVersion;
    }

    /**
     * Sets the value of the entityVersion property.
     * 
     */
    public void setEntityVersion(int value) {
        this.entityVersion = value;
    }

    /**
     * Gets the value of the accomodationId property.
     * 
     */
    public int getAccomodationId() {
        return accomodationId;
    }

    /**
     * Sets the value of the accomodationId property.
     * 
     */
    public void setAccomodationId(int value) {
        this.accomodationId = value;
    }

}

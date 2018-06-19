
package xmlweb.agent.soap.picture;

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
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
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
@XmlType(name = "PictureSOAP", propOrder = {
    "pictureId",
    "content",
    "entityVersion",
    "accomodationId"
})
public class PictureSOAP {

    @XmlElement(name = "picture_id")
    protected long pictureId;
    @XmlElement(required = true)
    protected byte[] content;
    @XmlElement(name = "entity_version")
    protected int entityVersion;
    @XmlElement(name = "accomodation_id")
    protected long accomodationId;

    /**
     * Gets the value of the pictureId property.
     * 
     */
    public long getPictureId() {
        return pictureId;
    }

    /**
     * Sets the value of the pictureId property.
     * 
     */
    public void setPictureId(long value) {
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

}

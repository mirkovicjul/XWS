//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.15 at 04:38:59 PM CEST 
//


package xmlweb.projekat.soap.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccomodationBonusServiceSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccomodationBonusServiceSOAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bonus_service_id">
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
@XmlType(name = "AccomodationBonusServiceSOAP", propOrder = {
    "bonusServiceId",
    "accomodationId"
})
public class AccomodationBonusServiceSOAP {

    @XmlElement(name = "bonus_service_id")
    protected int bonusServiceId;
    @XmlElement(name = "accomodation_id")
    protected int accomodationId;

    /**
     * Gets the value of the bonusServiceId property.
     * 
     */
    public int getBonusServiceId() {
        return bonusServiceId;
    }

    /**
     * Sets the value of the bonusServiceId property.
     * 
     */
    public void setBonusServiceId(int value) {
        this.bonusServiceId = value;
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

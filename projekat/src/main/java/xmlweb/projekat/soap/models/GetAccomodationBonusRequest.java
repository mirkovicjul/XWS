//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.15 at 04:38:59 PM CEST 
//


package xmlweb.projekat.soap.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accomodation_bonus_request" type="{http://xmlweb/projekat/soap/models}AccomodationBonusServiceSOAP" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accomodationBonusRequest"
})
@XmlRootElement(name = "getAccomodationBonusRequest")
public class GetAccomodationBonusRequest {

    @XmlElement(name = "accomodation_bonus_request")
    protected List<AccomodationBonusServiceSOAP> accomodationBonusRequest;

    /**
     * Gets the value of the accomodationBonusRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomodationBonusRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomodationBonusRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccomodationBonusServiceSOAP }
     * 
     * 
     */
    public List<AccomodationBonusServiceSOAP> getAccomodationBonusRequest() {
        if (accomodationBonusRequest == null) {
            accomodationBonusRequest = new ArrayList<AccomodationBonusServiceSOAP>();
        }
        return this.accomodationBonusRequest;
    }

}

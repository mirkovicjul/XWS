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
 * <p>Java class for AccomodationAgentSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccomodationAgentSOAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accomodation_agent_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="main_agent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="agent_id">
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
@XmlType(name = "AccomodationAgentSOAP", propOrder = {
    "accomodationAgentId",
    "mainAgent",
    "entityVersion",
    "accomodationId",
    "agentId"
})
public class AccomodationAgentSOAP {

    @XmlElement(name = "accomodation_agent_id")
    protected int accomodationAgentId;
    @XmlElement(name = "main_agent")
    protected boolean mainAgent;
    @XmlElement(name = "entity_version")
    protected int entityVersion;
    @XmlElement(name = "accomodation_id")
    protected int accomodationId;
    @XmlElement(name = "agent_id")
    protected int agentId;

    /**
     * Gets the value of the accomodationAgentId property.
     * 
     */
    public int getAccomodationAgentId() {
        return accomodationAgentId;
    }

    /**
     * Sets the value of the accomodationAgentId property.
     * 
     */
    public void setAccomodationAgentId(int value) {
        this.accomodationAgentId = value;
    }

    /**
     * Gets the value of the mainAgent property.
     * 
     */
    public boolean isMainAgent() {
        return mainAgent;
    }

    /**
     * Sets the value of the mainAgent property.
     * 
     */
    public void setMainAgent(boolean value) {
        this.mainAgent = value;
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

    /**
     * Gets the value of the agentId property.
     * 
     */
    public int getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     */
    public void setAgentId(int value) {
        this.agentId = value;
    }

}


package xmlweb.agent.soap.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationSOAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation_id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="end_date">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="number_of_persons">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="start_date">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="entity_version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accomodation">
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
@XmlType(name = "ReservationSOAP", propOrder = {
    "reservationId",
    "endDate",
    "numberOfPersons",
    "startDate",
    "entityVersion",
    "accomodation"
})
public class ReservationSOAP {

    @XmlElement(name = "reservation_id")
    protected long reservationId;
    @XmlElement(name = "end_date")
    protected long endDate;
    @XmlElement(name = "number_of_persons")
    protected int numberOfPersons;
    @XmlElement(name = "start_date")
    protected long startDate;
    @XmlElement(name = "entity_version")
    protected int entityVersion;
    protected long accomodation;

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public long getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(long value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     */
    public long getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     */
    public void setEndDate(long value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the numberOfPersons property.
     * 
     */
    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    /**
     * Sets the value of the numberOfPersons property.
     * 
     */
    public void setNumberOfPersons(int value) {
        this.numberOfPersons = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     */
    public long getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     */
    public void setStartDate(long value) {
        this.startDate = value;
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
     * Gets the value of the accomodation property.
     * 
     */
    public long getAccomodation() {
        return accomodation;
    }

    /**
     * Sets the value of the accomodation property.
     * 
     */
    public void setAccomodation(long value) {
        this.accomodation = value;
    }

}

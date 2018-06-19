
package xmlweb.agent.soap.reservation;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlweb.agent.soap.reservation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlweb.agent.soap.reservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReservationRequest }
     * 
     */
    public GetReservationRequest createGetReservationRequest() {
        return new GetReservationRequest();
    }

    /**
     * Create an instance of {@link ReservationRequest }
     * 
     */
    public ReservationRequest createReservationRequest() {
        return new ReservationRequest();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
    }

    /**
     * Create an instance of {@link ReservationSOAP }
     * 
     */
    public ReservationSOAP createReservationSOAP() {
        return new ReservationSOAP();
    }

}

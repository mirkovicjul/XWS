//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.23 at 01:54:52 PM CEST 
//


package xmlweb.projekat.soap.services.realised_reservation;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlweb.projekat.soap.services.realised_reservation package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlweb.projekat.soap.services.realised_reservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRealisedReservationRequest }
     * 
     */
    public GetRealisedReservationRequest createGetRealisedReservationRequest() {
        return new GetRealisedReservationRequest();
    }

    /**
     * Create an instance of {@link RealisedReservationRequest }
     * 
     */
    public RealisedReservationRequest createRealisedReservationRequest() {
        return new RealisedReservationRequest();
    }

    /**
     * Create an instance of {@link GetRealisedReservationResponse }
     * 
     */
    public GetRealisedReservationResponse createGetRealisedReservationResponse() {
        return new GetRealisedReservationResponse();
    }

    /**
     * Create an instance of {@link RealisedReservationSOAP }
     * 
     */
    public RealisedReservationSOAP createRealisedReservationSOAP() {
        return new RealisedReservationSOAP();
    }

}

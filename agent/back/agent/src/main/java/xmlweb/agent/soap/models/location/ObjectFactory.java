//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.23 at 11:00:56 AM CEST 
//


package xmlweb.agent.soap.models.location;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlweb.projekat.soap.models.location package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlweb.projekat.soap.models.location
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link LocationSOAP }
     * 
     */
    public LocationSOAP createLocationSOAP() {
        return new LocationSOAP();
    }

    /**
     * Create an instance of {@link GetLocationRequest }
     * 
     */
    public GetLocationRequest createGetLocationRequest() {
        return new GetLocationRequest();
    }

    /**
     * Create an instance of {@link LocationRequest }
     * 
     */
    public LocationRequest createLocationRequest() {
        return new LocationRequest();
    }

}

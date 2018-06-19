
package xmlweb.agent.soap.picture;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlweb.agent.soap.picture package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlweb.agent.soap.picture
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPictureResponse }
     * 
     */
    public GetPictureResponse createGetPictureResponse() {
        return new GetPictureResponse();
    }

    /**
     * Create an instance of {@link PictureSOAP }
     * 
     */
    public PictureSOAP createPictureSOAP() {
        return new PictureSOAP();
    }

    /**
     * Create an instance of {@link GetPictureRequest }
     * 
     */
    public GetPictureRequest createGetPictureRequest() {
        return new GetPictureRequest();
    }

    /**
     * Create an instance of {@link PictureRequest }
     * 
     */
    public PictureRequest createPictureRequest() {
        return new PictureRequest();
    }

}


package xmlweb.agent.soap.picture;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PicturePort", targetNamespace = "http://xmlweb/projekat/entities/soap")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PicturePort {


    /**
     * 
     * @param getPictureRequest
     * @return
     *     returns xmlweb.agent.soap.picture.GetPictureResponse
     */
    @WebMethod
    @WebResult(name = "getPictureResponse", targetNamespace = "http://xmlweb/projekat/model/soap", partName = "getPictureResponse")
    public GetPictureResponse getPicture(
        @WebParam(name = "getPictureRequest", targetNamespace = "http://xmlweb/projekat/model/soap", partName = "getPictureRequest")
        GetPictureRequest getPictureRequest);

}
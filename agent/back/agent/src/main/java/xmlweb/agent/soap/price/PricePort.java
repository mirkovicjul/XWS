
package xmlweb.agent.soap.price;

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
@WebService(name = "PricePort", targetNamespace = "http://xmlweb/projekat/entities/soap")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PricePort {


    /**
     * 
     * @param getPriceRequest
     * @return
     *     returns xmlweb.agent.soap.price.GetPriceResponse
     */
    @WebMethod
    @WebResult(name = "getPriceResponse", targetNamespace = "http://xmlweb/projekat/soap/models", partName = "getPriceResponse")
    public GetPriceResponse getPrice(
        @WebParam(name = "getPriceRequest", targetNamespace = "http://xmlweb/projekat/soap/models", partName = "getPriceRequest")
        GetPriceRequest getPriceRequest);

}
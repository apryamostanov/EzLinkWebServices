
package com.ezlinkwebservices.service.reciept;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.ezlinkwebservices.service.reciept.request.EZLINGWSREQENV;
import com.ezlinkwebservices.service.reciept.response.EZLINGWSRESENV;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecieptPortType", targetNamespace = "http://ezlinkwebservices.com/service/Reciept")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.ezlinkwebservices.service.reciept.ObjectFactory.class,
    com.ezlinkwebservices.service.reciept.request.ObjectFactory.class,
    com.ezlinkwebservices.service.reciept.response.ObjectFactory.class
})
public interface RecieptPortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.ezlinkwebservices.service.reciept.response.EZLINGWSRESENV
     * @throws RecieptFault_Exception
     */
    @WebMethod(operationName = "Reciept")
    @WebResult(name = "EZLING_WS_RES_ENV", targetNamespace = "http://ezlinkwebservices.com/service/Reciept/response", partName = "parameters")
    public EZLINGWSRESENV reciept(
        @WebParam(name = "EZLING_WS_REQ_ENV", targetNamespace = "http://ezlinkwebservices.com/service/Reciept/request", partName = "parameters")
        EZLINGWSREQENV parameters)
        throws RecieptFault_Exception
    ;

}

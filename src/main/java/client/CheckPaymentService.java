
package client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CheckPaymentService", targetNamespace = "http://check_payment/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CheckPaymentService {


    /**
     * 
     * @param arg0
     * @return
     *     returns client.Cheque
     */
    @WebMethod(operationName = "CreateCheque")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CreateCheque", targetNamespace = "http://check_payment/", className = "client.CreateCheque")
    @ResponseWrapper(localName = "CreateChequeResponse", targetNamespace = "http://check_payment/", className = "client.CreateChequeResponse")
    @Action(input = "http://check_payment/CheckPaymentService/CreateChequeRequest", output = "http://check_payment/CheckPaymentService/CreateChequeResponse")
    public Cheque createCheque(
        @WebParam(name = "arg0", targetNamespace = "")
        Order arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<client.CheckPaymentResponse>
     */
    @WebMethod(operationName = "CheckPayment")
    @RequestWrapper(localName = "CheckPayment", targetNamespace = "http://check_payment/", className = "client.CheckPayment")
    @ResponseWrapper(localName = "CheckPaymentResponse", targetNamespace = "http://check_payment/", className = "client.CheckPaymentResponse")
    public Response<CheckPaymentResponse> checkPaymentAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        Cheque arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "CheckPayment")
    @RequestWrapper(localName = "CheckPayment", targetNamespace = "http://check_payment/", className = "client.CheckPayment")
    @ResponseWrapper(localName = "CheckPaymentResponse", targetNamespace = "http://check_payment/", className = "client.CheckPaymentResponse")
    public Future<?> checkPaymentAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        Cheque arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<CheckPaymentResponse> asyncHandler);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns client.Cheque
     */
    @WebMethod(operationName = "CheckPayment")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CheckPayment", targetNamespace = "http://check_payment/", className = "client.CheckPayment")
    @ResponseWrapper(localName = "CheckPaymentResponse", targetNamespace = "http://check_payment/", className = "client.CheckPaymentResponse")
    @Action(input = "http://check_payment/CheckPaymentService/CheckPaymentRequest", output = "http://check_payment/CheckPaymentService/CheckPaymentResponse")
    public Cheque checkPayment(
        @WebParam(name = "arg0", targetNamespace = "")
        Cheque arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1);

}

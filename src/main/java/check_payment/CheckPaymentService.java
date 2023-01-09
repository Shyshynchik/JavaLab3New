package check_payment;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "CheckPaymentService", portName = "CheckPaymentPort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class CheckPaymentService {
    @WebMethod(operationName = "CreateCheque")
    public Cheque createCheque(Order order) {

        Cheque cheque = new Cheque();
        cheque.setOrder(order);
        cheque.setChequeCost(order.getOrderCost());
        cheque.setChequePaid(false);

        return cheque;
    }

    @WebMethod(operationName = "CheckPayment")
    public Cheque checkPayment(Cheque cheque, boolean paymentStatus) {

        try {
            Thread.sleep(1000 * 3);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        cheque.setChequePaid(paymentStatus);

        if (paymentStatus) {
            System.out.println("Payment was confirmed");
        }
        else {
            System.out.println("Payment was not confirmed");
        }

        return cheque;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/CheckPayment", new CheckPaymentService());
    }
}

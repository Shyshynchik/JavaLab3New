
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _CheckPayment_QNAME = new QName("http://check_payment/", "CheckPayment");
    private final static QName _CreateCheque_QNAME = new QName("http://check_payment/", "CreateCheque");
    private final static QName _CreateChequeResponse_QNAME = new QName("http://check_payment/", "CreateChequeResponse");
    private final static QName _CheckPaymentResponse_QNAME = new QName("http://check_payment/", "CheckPaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCheque }
     * 
     */
    public CreateCheque createCreateCheque() {
        return new CreateCheque();
    }

    /**
     * Create an instance of {@link CheckPayment }
     * 
     */
    public CheckPayment createCheckPayment() {
        return new CheckPayment();
    }

    /**
     * Create an instance of {@link CheckPaymentResponse }
     * 
     */
    public CheckPaymentResponse createCheckPaymentResponse() {
        return new CheckPaymentResponse();
    }

    /**
     * Create an instance of {@link CreateChequeResponse }
     * 
     */
    public CreateChequeResponse createCreateChequeResponse() {
        return new CreateChequeResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Cheque }
     * 
     */
    public Cheque createCheque() {
        return new Cheque();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://check_payment/", name = "CheckPayment")
    public JAXBElement<CheckPayment> createCheckPayment(CheckPayment value) {
        return new JAXBElement<CheckPayment>(_CheckPayment_QNAME, CheckPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCheque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://check_payment/", name = "CreateCheque")
    public JAXBElement<CreateCheque> createCreateCheque(CreateCheque value) {
        return new JAXBElement<CreateCheque>(_CreateCheque_QNAME, CreateCheque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateChequeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://check_payment/", name = "CreateChequeResponse")
    public JAXBElement<CreateChequeResponse> createCreateChequeResponse(CreateChequeResponse value) {
        return new JAXBElement<CreateChequeResponse>(_CreateChequeResponse_QNAME, CreateChequeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://check_payment/", name = "CheckPaymentResponse")
    public JAXBElement<CheckPaymentResponse> createCheckPaymentResponse(CheckPaymentResponse value) {
        return new JAXBElement<CheckPaymentResponse>(_CheckPaymentResponse_QNAME, CheckPaymentResponse.class, null, value);
    }

}

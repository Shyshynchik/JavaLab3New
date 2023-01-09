package client;

import org.camunda.bpm.client.ExternalTaskClient;

import javax.xml.ws.Response;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class CheckPaymentClient {
    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public Order generateOrder() {
        Order order = new Order();
        Product product = new Product();
        product.setProductCost(100);
        product.setProductName("Bible");
        product.setProductType("Book");
        product.setReserved(true);
        order.setOrderProduct(product);
        User user = new User();
        user.setNickName("Anime");
        user.setPassWord("Anime");
        order.setOrderUser(user);
        order.setOrderCost(product.getProductCost());
        order.setOrderPayment(false);
        return order;
    }

    public Cheque processPolling(URL url) {
        Order order = generateOrder();
        CheckPaymentService_Service checkPaymentService_service = new CheckPaymentService_Service(url);
        CheckPaymentService port = checkPaymentService_service.getCheckPaymentPort();

        System.out.println("Creating cheque...");
        Cheque cheque = port.createCheque(order);

        System.out.println("Checking payment...");
        Random random = new Random();
        boolean isPaid = random.nextBoolean();
        cheque = port.checkPayment(cheque, isPaid);

        Response<CheckPaymentResponse> response = port.checkPaymentAsync(cheque, isPaid);
        System.out.println("Polling started");

        while(!response.isDone()) {
            try {
                System.out.println("Polling...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            cheque = response.get().getReturn();

            if (cheque.chequePaid) {
                System.out.println("Success!");
            }
            else {
                System.out.println("Payment error!");
            }

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    return cheque;
    }

    public void process(URL url) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        client.subscribe("CheckPaymentTopic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {

                    Cheque cheque = processPolling(url);
                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //
                    Map<String, Object> map = new HashMap<>();
                    map.put("cheque", cheque);
                    map.put("paymentConfirm", cheque.isChequePaid());

                    // Complete the task
                    externalTaskService.complete(externalTask, map);
                })
                .open();
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8082/CheckPayment?wsdl");
        CheckPaymentClient checkOrderClient = new CheckPaymentClient();
        checkOrderClient.process(url);
    }
}

package interfaceexample.paymentgateway;

public class PaymentGatewayMainClass {
    public static void main(String[] args) {
        PaymentGateway credit = new CreditCardPayment();
        PaymentGateway paypal = new PayPalPayment();
        System.out.println("Payment amount through credit card is " + credit.processPayment(200));
        System.out.println("Payment amount through paypal is " + paypal.processPayment(100));
    }
}

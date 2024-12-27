package interfaceexample.paymentgateway;

public class PayPalPayment implements PaymentGateway{
    @Override
    public double processPayment(double amount){
        return amount;
    }
}

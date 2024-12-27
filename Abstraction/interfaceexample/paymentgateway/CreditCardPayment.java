package interfaceexample.paymentgateway;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public double processPayment(double amount){
        return amount;
    }
}

package runtime.payment;

public class CreditCard implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment can be done by credit card");
    }
}

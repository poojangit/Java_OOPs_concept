package runtime.payment;

public class UpiPayment implements Payment{
    @Override
    public void payment() {
        System.out.println("Payment can be done by UPi through google pay");
    }
}

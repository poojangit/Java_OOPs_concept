package runtime.payment;

public class PaymentMainClass {
    public static void main(String[] args) {
        Payment creditPay = new CreditCard();
        creditPay.payment();
        Payment UpiPay = new UpiPayment();
        UpiPay.payment();
    }
}

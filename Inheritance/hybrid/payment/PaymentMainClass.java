package hybrid.payment;

public class PaymentMainClass {
    public static void main(String[] args) {
        AcceptedPayments pay = new AcceptedPayments();
        pay.payment();
        pay.paymentOption();
        pay.CreditCardPay();
        pay.upiPay();
    }
}

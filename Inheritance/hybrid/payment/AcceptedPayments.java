package hybrid.payment;

public class AcceptedPayments implements DebitCredit {
    
    @Override
    public void payment() {
        System.out.println("Paymnet gateway is open for the two options: ");
    }
    @Override
    public void paymentOption(){
        System.out.println("Option is between debit and credit card");
    }
    @Override
    public void CreditCardPay() {
        System.out.println("You can make the payment through credit card");
    }
    @Override
    public void upiPay() {
        System.out.println("You can make the payment through upi apps");
    }
}

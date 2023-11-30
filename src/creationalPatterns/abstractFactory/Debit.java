package creationalPatterns.abstractFactory;

public class Debit implements PaymentMethod {

    @Override
    public String doPayment() {
        return "Payment made with debit card";
    }

}

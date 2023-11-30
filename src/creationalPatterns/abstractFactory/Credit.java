package creationalPatterns.abstractFactory;

public class Credit implements PaymentMethod {

    @Override
    public String doPayment() {
        return "Payment made with credit card";
    }

}

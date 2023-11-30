package creationalPatterns.factoryMethod;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment) {
        switch (typePayment) {
            case CARD:
                return new CardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            case PAYPAL:
                return new PaypalPayment();
            default:
                throw new IllegalArgumentException("Payment type not supported");
        }
    }

}

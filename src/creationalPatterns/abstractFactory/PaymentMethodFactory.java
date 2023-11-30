package creationalPatterns.abstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {

    @Override
    public PaymentMethod create(String type) {
        if ("DEBIT".equals(type)) {
            return new Debit();
        } else if ("CREDIT".equals(type)) {
            return new Credit();
        }
        return null;
    }

}

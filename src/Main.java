import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactory.Card;
import creationalPatterns.abstractFactory.FactoryProvider;
import creationalPatterns.abstractFactory.PaymentMethod;
import creationalPatterns.factoryMethod.Payment;
import creationalPatterns.factoryMethod.PaymentFactory;
import creationalPatterns.factoryMethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("knowing design patterns with java!");

//      Factory Method
        testFactoryMethod();

//      Abstract Factory
        testAbstractFactory();
    }

    private static void testAbstractFactory() {

        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card card = (Card) abstractFactory.create("VISA");

        AbstractFactory abstractFactory2 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory2.create("DEBIT");

        System.out.println(
                "Card type: " + card.getCardType() + "\nCard number: " + card.getCardNumber() + "\nPayment method: " + paymentMethod.doPayment());

    }

    private static void testFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(TypePayment.PAYPAL);
        payment.doPayment();
    }

}
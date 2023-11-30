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

//      Creational Design Patterns
        testFactoryMethod();
        testAbstractFactory();
        testBuilder();
    }

    private static void testBuilder() {
        creationalPatterns.builder.Card card = new creationalPatterns.builder.Card.CardBuilder(
                "VISA",
                "123456789")
                .name("John Doe")
                .expiryDate(2030)
                .creditCard(true)
                .build();

        System.out.println(card.toString());
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
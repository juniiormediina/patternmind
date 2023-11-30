import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactory.Card;
import creationalPatterns.abstractFactory.FactoryProvider;
import creationalPatterns.abstractFactory.PaymentMethod;
import creationalPatterns.factoryMethod.Payment;
import creationalPatterns.factoryMethod.PaymentFactory;
import creationalPatterns.factoryMethod.TypePayment;
import creationalPatterns.prototype.PrototypeCard;
import creationalPatterns.prototype.PrototypeFactory;

import static creationalPatterns.prototype.PrototypeFactory.CartType.AMEX;
import static creationalPatterns.prototype.PrototypeFactory.CartType.VISA;

public class Main {
    public static void main(String[] args) {
        System.out.println("knowing design patterns with java!");

//      Creational Design Patterns
        testFactoryMethod();
        testAbstractFactory();
        testBuilder();
        testPrototype();
    }

    private static void testPrototype() {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
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
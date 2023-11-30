package creationalPatterns.factoryMethod;

public class CardPayment implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Credit Card payment");
    }

}

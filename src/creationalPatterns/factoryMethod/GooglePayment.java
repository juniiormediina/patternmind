package creationalPatterns.factoryMethod;

public class GooglePayment implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Google payment");
    }

}

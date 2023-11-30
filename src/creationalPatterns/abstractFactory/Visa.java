package creationalPatterns.abstractFactory;

public class Visa implements Card {

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "1234 5678 9012 3456";
    }

}

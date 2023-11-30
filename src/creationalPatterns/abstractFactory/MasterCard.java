package creationalPatterns.abstractFactory;

public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "1234 5678 2023 3456";
    }

}

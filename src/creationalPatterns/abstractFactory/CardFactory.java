package creationalPatterns.abstractFactory;

public class CardFactory implements AbstractFactory<Card> {

    @Override
    public Card create(String type) {
        if ("VISA".equals(type)) {
            return new Visa();
        } else if ("MASTERCARD".equals(type)) {
            return new MasterCard();
        }
        return null;
    }

}

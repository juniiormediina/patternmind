package creationalPatterns.builder;

public class Card {

    private final String cardType;
    private final String cardNumber;
    private final String name;
    private final int expiryDate;
    private final Boolean creditCard;

    public Card(CardBuilder builder) {
        this.cardType = builder.cardType;
        this.cardNumber = builder.cardNumber;
        this.name = builder.name;
        this.expiryDate = builder.expiryDate;
        this.creditCard = builder.creditCard;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public Boolean getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardType='" + cardType + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", name='" + name + '\'' +
                ", expiryDate=" + expiryDate +
                ", creditCard=" + creditCard +
                '}';
    }

    public static class CardBuilder {
        private final String cardType;
        private final String cardNumber;
        private String name;
        private int expiryDate;
        private Boolean creditCard;

        public CardBuilder(String cardType, String cardNumber) {
            this.cardType = cardType;
            this.cardNumber = cardNumber;
        }

        public CardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CardBuilder expiryDate(int expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public CardBuilder creditCard(Boolean creditCard) {
            this.creditCard = creditCard;
            return this;
        }

        public Card build() {
            return new Card(this);
        }

    }

}

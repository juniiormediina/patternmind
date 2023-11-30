package creationalPatterns.abstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Card")) {
            return new CardFactory();
        } else if (choice.equalsIgnoreCase("PaymentMethod")) {
            return new PaymentMethodFactory();
        }

//            if ("Card".equals(choice)) {
//                return new CardFactory();
//            } else if ("PaymentMethod".equals(choice)) {
//                return new PaymentMethodFactory();
//            }

        return null;
    }

}

package creationalPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

import static creationalPatterns.prototype.PrototypeFactory.CartType.AMEX;
import static creationalPatterns.prototype.PrototypeFactory.CartType.VISA;

public class PrototypeFactory {

    public static class CartType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static final Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException{
        return prototypes.get(tipo).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("This card is Visa and its number is 16 digits.");
        prototypes.put(VISA, visa);

        Amex amex = new Amex();
        amex.setName("This card is Amex and its number is 16 digits.");
        prototypes.put(AMEX, amex);
    }

}

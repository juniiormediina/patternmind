package creationalPatterns.prototype;

public class Amex implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("This is an Amex card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning Amex card...");
        return (Amex) super.clone();
    }

}

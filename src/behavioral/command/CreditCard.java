package behavioral.command;

public class CreditCard {

    public void sendPinNumberToCustomer() {
        System.out.println("The pin number has been sent to the client.");
    }

    public void activate() {
        System.out.println("The card has been activated.");
    }

    public void sendSMSToCustomerActivate() {
        System.out.println(
                "Sent SMS to the customer informing that their card has been activated. Get in touch if you haven't " +
                        "received it.");
    }

    public void desactivate() {
        System.out.println("The card has been deactivated.");
    }

    public void sendSMSToCustomerDesactivate() {
        System.out.println("Sent SMS to the customer informing that their card has been deactivated.");
    }

}

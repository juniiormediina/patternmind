package behavioral.chainofresponsibility;

public class CreditCard implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override public ApproveLoanChain getNext() {
        return next;
    }

    @Override public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override public void crediCardRequest(int totalLoan) {
        Gold gold = new Gold();
        this.setNext(gold);

        Platinium platinium = new Platinium();
        gold.setNext(platinium);

        Black black = new Black();
        platinium.setNext(black);

        next.crediCardRequest(totalLoan);
    }
}
package behavioral.chainofresponsibility;

public class Platinium implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override public ApproveLoanChain getNext() {
        return next;
    }

    @Override public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override public void crediCardRequest(int totalLoan) {
        if (totalLoan > 10000 && totalLoan <= 50000) {
            System.out.println("According to the validations carried out, the client can handle the Platinium card");
        } else {
            next.crediCardRequest(totalLoan);
        }
    }
}

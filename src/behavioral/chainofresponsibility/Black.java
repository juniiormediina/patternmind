package behavioral.chainofresponsibility;

public class Black implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override public ApproveLoanChain getNext() {
        return next;
    }

    @Override public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override public void crediCardRequest(int totalLoan) {
        if (totalLoan > 50000) {
            System.out.println("EAccording to the validations carried out, the client can handle the Black card");
        } else {
            next.crediCardRequest(totalLoan);
        }
    }
}

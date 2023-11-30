package behavioral.chainofresponsibility;

public class Gold implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override public ApproveLoanChain getNext() {
        return next;
    }

    @Override public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override public void crediCardRequest(int totalLoan) {
        if (totalLoan <= 10000) {
            System.out.println("According to the validations carried out, the client can handle the gold card");
        } else {
            next.crediCardRequest(totalLoan);
        }
    }
}

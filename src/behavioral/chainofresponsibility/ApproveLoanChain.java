package behavioral.chainofresponsibility;

public interface ApproveLoanChain {

    ApproveLoanChain getNext();

    void setNext(ApproveLoanChain loan);

    void crediCardRequest(int totalLoan);

}

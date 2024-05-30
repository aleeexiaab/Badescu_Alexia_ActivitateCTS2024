package Problem_5;

public class Main {
    public static void main(String[] args) {
        ExistingLoanApplication loanApplication = new ExistingLoanApplication("Client 1", 15000, 36);
        FrameworkLeasingCredit frameworkLeasingCredit = new FrameworkLeasingCredit();
        LeasingCreditAdapter adapter = new LeasingCreditAdapterImpl(frameworkLeasingCredit);

        adapter.requestCredit(loanApplication);
    }
}

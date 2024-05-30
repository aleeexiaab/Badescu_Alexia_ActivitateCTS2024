package Problem_5;

public class LeasingCreditAdapterImpl implements LeasingCreditAdapter {
    private FrameworkLeasingCredit frameworkLeasingCredit;

    public LeasingCreditAdapterImpl(FrameworkLeasingCredit frameworkLeasingCredit) {
        this.frameworkLeasingCredit = frameworkLeasingCredit;
    }

    @Override
    public void requestCredit(ExistingLoanApplication loanApplication) {
        frameworkLeasingCredit.requestLeasing(loanApplication.getClientName(), loanApplication.getAmount(), loanApplication.getDuration());
    }
}

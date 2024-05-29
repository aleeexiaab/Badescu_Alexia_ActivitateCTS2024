package Problem_1;

public class MortgageLoanFactory extends LoanFactory{
    @Override
    public Loan createLoan(double amount, double interestRate, int term) {
        return new MortgageLoan(amount, interestRate, term);
    }
}

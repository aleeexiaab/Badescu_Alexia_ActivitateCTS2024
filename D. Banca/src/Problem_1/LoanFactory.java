package Problem_1;

public abstract class LoanFactory {
    public abstract Loan createLoan(double amount, double interestRate, int term);
}

package Problem_1;

public class PersonalLoanFactory extends LoanFactory{
    @Override
    public Loan createLoan(double amount, double interestRate, int term) {
        return new PersonalLoan(amount, interestRate, term);
    }
}

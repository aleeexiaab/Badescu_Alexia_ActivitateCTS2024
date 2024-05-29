package Problem_1;

public class Main {
    public static void main(String[] args) {
        LoanFactory personalLoanFactory = new PersonalLoanFactory();
        Loan personalLoan = personalLoanFactory.createLoan(5000, 5.5, 2);
        personalLoan.getDetails();

        LoanFactory mortgageLoanFactory = new MortgageLoanFactory();
        Loan mortgageLoan = mortgageLoanFactory.createLoan(200000, 3.5, 15);
        mortgageLoan.getDetails();
    }
}

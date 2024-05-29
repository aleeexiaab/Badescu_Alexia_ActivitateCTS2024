package Problem_1;

public class MortgageLoan extends Loan{
    public MortgageLoan(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public void getDetails() {
        System.out.println("Mortgage Loan: Amount = " + amount + ", Interest Rate = " + interestRate + "%, Term = " + term + " years");
    }
}

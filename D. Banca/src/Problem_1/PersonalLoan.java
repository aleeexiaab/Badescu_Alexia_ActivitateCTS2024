package Problem_1;

public class PersonalLoan extends Loan{
    public PersonalLoan(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public void getDetails() {
        System.out.println("Personal Loan: Amount = " + amount + ", Interest Rate = " + interestRate + "%, Term = " + term + " years");
    }
}

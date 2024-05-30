package Problem_10;

public class BankAccount {
    private String accountNumber;
    private double amount;
    private AccountHolder accountHolder;
    private BankInfo bankInfo;

    public BankAccount(String accountNumber, double amount, AccountHolder accountHolder, BankInfo bankInfo) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountHolder = accountHolder;
        this.bankInfo = bankInfo;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Amount: " + amount);
        accountHolder.display();
        bankInfo.display();
    }
}

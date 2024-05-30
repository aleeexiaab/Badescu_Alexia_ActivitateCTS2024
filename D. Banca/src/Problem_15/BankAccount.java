package Problem_15;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", current balance: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", current balance: " + balance);
        } else {
            System.out.println("Insufficient funds, current balance: " + balance);
        }
    }

    public void constitute() {
        balance = 0;
        System.out.println("Account constituted, current balance: " + balance);
    }
}

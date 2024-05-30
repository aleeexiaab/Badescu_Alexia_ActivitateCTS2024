package Problem_16;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + name + ", remaining balance: " + balance);
            return true;
        } else {
            return false;
        }
    }
}

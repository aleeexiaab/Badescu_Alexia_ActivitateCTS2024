package Problem_16;

public class ConcreteAccountHandler extends AccountHandler{
    private Account account;

    public ConcreteAccountHandler(Account account) {
        this.account = account;
    }

    @Override
    public boolean handleRequest(double amount) {
        if (account.withdraw(amount)) {
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(amount);
        } else {
            System.out.println("Payment of " + amount + " cannot be processed. Insufficient funds.");
            return false;
        }
    }
}

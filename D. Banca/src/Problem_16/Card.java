package Problem_16;

public class Card {
    private AccountHandler firstHandler;

    public void setHandlers(AccountHandler firstHandler) {
        this.firstHandler = firstHandler;
    }

    public void makePayment(double amount) {
        if (!firstHandler.handleRequest(amount)) {
            System.out.println("Payment of " + amount + " failed.");
        }
    }
}

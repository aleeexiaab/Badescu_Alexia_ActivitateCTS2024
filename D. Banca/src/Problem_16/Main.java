package Problem_16;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Checking Account", 100);
        Account account2 = new Account("Savings Account", 200);
        Account account3 = new Account("Credit Account", 300);

        AccountHandler handler1 = new ConcreteAccountHandler(account1);
        AccountHandler handler2 = new ConcreteAccountHandler(account2);
        AccountHandler handler3 = new ConcreteAccountHandler(account3);

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Card card = new Card();
        card.setHandlers(handler1);

        card.makePayment(150);
        card.makePayment(250);
        card.makePayment(500);
    }
}

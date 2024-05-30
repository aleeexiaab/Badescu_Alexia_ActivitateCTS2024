package Problem_12;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BankClient client1 = new BankClient("Client 1");
        BankClient client2 = new BankClient("Client 2");
        BankClient client3 = new BankClient("Client 3");

        bank.subscribe(client1);
        bank.subscribe(client2);
        bank.subscribe(client3);

        bank.notifyObservers("New interest rates are available!");

        bank.unsubscribe(client2);

        bank.notifyObservers("We have updated our privacy policy.");
    }
}

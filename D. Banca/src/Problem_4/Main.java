package Problem_4;

public class Main {
    public static void main(String[] args) {
        try {
            Client originalClient = new Client("Client 1", "ID12345", "CC67890");

            BankAccount account1 = new BankAccount(originalClient, "ACC1001");
            System.out.println(account1);

            Client clonedClient = originalClient.clone();

            BankAccount account2 = new BankAccount(clonedClient, "ACC1002");
            System.out.println(account2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package Problem_10;

public class Main {
    public static void main(String[] args) {
        AccountHolderFactory accountHolderFactory = new AccountHolderFactory();
        BankInfo bankInfo = new BankInfo("National Bank", "Main Branch", 1000000);

        AccountHolder holder1 = accountHolderFactory.getAccountHolder("Client 1", "123 Main St", "555-1234", "john@example.com");
        AccountHolder holder2 = accountHolderFactory.getAccountHolder("Client 2", "456 Elm St", "555-5678", "jane@example.com");

        BankAccount account1 = new BankAccount("ACC123", 1500.00, holder1, bankInfo);
        BankAccount account2 = new BankAccount("ACC456", 2500.00, holder1, bankInfo);
        BankAccount account3 = new BankAccount("ACC789", 3500.00, holder2, bankInfo);

        account1.display();
        account2.display();
        account3.display();
    }
}

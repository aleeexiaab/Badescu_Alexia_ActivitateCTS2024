package Problem_4;

public class BankAccount {
    private Client client;
    private String accountNumber;

    public BankAccount(Client client, String accountNumber) {
        this.client = client;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "client=" + client +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

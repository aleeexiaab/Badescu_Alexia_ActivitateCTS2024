package Problem_3;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount.BankAccountBuilder("Client 1")
                .setSalaryAccount(true)
                .setHasDebitCard(true)
                .build();

        BankAccount account2 = new BankAccount.BankAccountBuilder("Client 2")
                .setHasInternetBanking(true)
                .build();

        BankAccount account3 = new BankAccount.BankAccountBuilder("Client 3")
                .build();

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}

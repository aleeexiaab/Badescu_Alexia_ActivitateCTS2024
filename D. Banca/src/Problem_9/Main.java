package Problem_9;

public class Main {
    public static void main(String[] args) {
        BankComponent branch1 = new Branch("Branch 1");
        BankComponent branch2 = new Branch("Branch 2");
        BankComponent branch3 = new Branch("Branch 3");

        Agency agency1 = new Agency("Agency 1");
        agency1.addComponent(branch1);
        agency1.addComponent(branch2);

        Agency agency2 = new Agency("Agency 2");
        agency2.addComponent(branch3);

        Bank bank = new Bank("Main Bank");
        bank.addComponent(agency1);
        bank.addComponent(agency2);

        bank.displayDetails();
    }
}

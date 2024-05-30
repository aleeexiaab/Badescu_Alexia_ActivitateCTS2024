package Problem_7;

public class Main {
    public static void main(String[] args) {
        AccountCreationFacade accountCreation = new AccountCreationFacade();

        String personName = "Client 1";
        int age = 30;

        boolean accountCreated = accountCreation.createAccount(personName, age);
        System.out.println("Account creation status: " + accountCreated);
    }
}

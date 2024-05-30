package Problem_8;

public class Main {
    public static void main(String[] args) {
        Credit credit = new CreditProxy();

        credit.createAccount("USD");
        credit.createAccount("EUR");
        credit.createAccount("RON");
    }
}

package Problem_8;

public class RealCredit implements Credit{
    @Override
    public void createAccount(String currency) {
        System.out.println("Account created in " + currency);
    }
}

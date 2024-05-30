package Problem_8;

public class CreditProxy implements Credit{
    private RealCredit realCredit;

    public CreditProxy() {
        this.realCredit = new RealCredit();
    }

    @Override
    public void createAccount(String currency) {
        if ("RON".equals(currency)) {
            realCredit.createAccount(currency);
        } else {
            System.out.println("Account can only be created in RON.");
        }
    }
}

package Problem_14;

public class ATMWithdrawal extends ATMWithdrawalTemplate{
    @Override
    protected void insertCard() {
        System.out.println("Card inserted.");
    }

    @Override
    protected void enterPin() {
        System.out.println("PIN entered.");
    }

    @Override
    protected void specifyAmount() {
        System.out.println("Amount specified.");
    }

    @Override
    protected void dispenseCash() {
        System.out.println("Cash dispensed.");
    }

    @Override
    protected void ejectCard() {
        System.out.println("Card ejected.");
    }
}

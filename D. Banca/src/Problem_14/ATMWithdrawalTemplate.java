package Problem_14;

public abstract class ATMWithdrawalTemplate {
    public final void withdrawMoney() {
        insertCard();
        enterPin();
        specifyAmount();
        dispenseCash();
        ejectCard();
    }

    protected abstract void insertCard();
    protected abstract void enterPin();
    protected abstract void specifyAmount();
    protected abstract void dispenseCash();
    protected abstract void ejectCard();
}

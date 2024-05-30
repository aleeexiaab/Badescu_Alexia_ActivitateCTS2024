package Problem_13;

public class ATMMachine {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState hasPinState;
    private ATMState noCashState;

    private ATMState currentState;
    private int cashInMachine;

    public ATMMachine(int cashInMachine) {
        noCardState = new NoCard(this);
        hasCardState = new HasCard(this);
        hasPinState = new HasPin(this);
        noCashState = new NoCash(this);

        this.cashInMachine = cashInMachine;
        currentState = cashInMachine > 0 ? noCardState : noCashState;
    }

    public void setATMState(ATMState newState) {
        currentState = newState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getHasPinState() {
        return hasPinState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void requestCash(int amount) {
        currentState.requestCash(amount);
    }
}

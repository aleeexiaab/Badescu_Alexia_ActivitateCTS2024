package Problem_13;

public class HasCard implements ATMState{
    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN entered.");
            atmMachine.setATMState(atmMachine.getHasPinState());
        } else {
            System.out.println("Incorrect PIN entered.");
            ejectCard();
        }
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter PIN first.");
    }
}

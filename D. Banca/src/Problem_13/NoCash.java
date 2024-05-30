package Problem_13;

public class NoCash implements ATMState{
    private ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No cash available in the ATM.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No cash available in the ATM.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("No cash available in the ATM.");
    }
}

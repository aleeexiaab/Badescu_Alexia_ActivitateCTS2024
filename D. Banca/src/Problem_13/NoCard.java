package Problem_13;

public class NoCard implements ATMState{
    private ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
        atmMachine.setATMState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No card inserted.");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("No card inserted.");
    }
}

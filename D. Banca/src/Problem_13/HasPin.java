package Problem_13;

public class HasPin implements ATMState{
    private ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
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
        System.out.println("PIN already entered.");
    }

    @Override
    public void requestCash(int amount) {
        if (atmMachine.getCashInMachine() >= amount) {
            System.out.println("Dispensing " + amount + " cash.");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - amount);

            if (atmMachine.getCashInMachine() == 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            } else {
                atmMachine.setATMState(atmMachine.getNoCardState());
            }
        } else {
            System.out.println("Not enough cash available.");
            atmMachine.setATMState(atmMachine.getNoCashState());
            ejectCard();
        }
    }
}

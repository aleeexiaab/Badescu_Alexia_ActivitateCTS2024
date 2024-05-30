package Problem_13;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(1000);

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(500);

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(600);

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(100);
    }
}

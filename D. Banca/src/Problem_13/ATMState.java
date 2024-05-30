package Problem_13;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void requestCash(int amount);
}

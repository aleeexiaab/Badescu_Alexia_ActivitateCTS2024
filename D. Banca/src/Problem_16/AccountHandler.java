package Problem_16;

public abstract class AccountHandler {
    protected AccountHandler nextHandler;

    public void setNextHandler(AccountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean handleRequest(double amount);
}

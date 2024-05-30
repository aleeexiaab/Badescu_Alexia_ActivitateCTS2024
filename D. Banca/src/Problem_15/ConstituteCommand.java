package Problem_15;

public class ConstituteCommand implements Command{
    private BankAccount account;

    public ConstituteCommand(BankAccount account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.constitute();
    }

    @Override
    public void undo() {
        System.out.println("Cannot undo constitution of the account.");
    }
}

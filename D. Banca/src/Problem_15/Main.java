package Problem_15;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        BankOperator operator = new BankOperator();

        Command depositCommand = new DepositCommand(account, 200);
        Command withdrawCommand = new WithdrawCommand(account, 150);
        Command constituteCommand = new ConstituteCommand(account);

        operator.setCommand(depositCommand);
        operator.executeCommand();
        operator.undoCommand();

        operator.setCommand(withdrawCommand);
        operator.executeCommand();
        operator.undoCommand();

        operator.setCommand(constituteCommand);
        operator.executeCommand();
        operator.undoCommand();
    }
}

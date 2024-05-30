package Problem_12;

public class BankClient implements Observer{
    private String name;

    public BankClient(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

package Problem_9;

public class Branch implements BankComponent{
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Branch: " + name);
    }
}

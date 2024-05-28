package Problem_12;

public class Client12 implements Observer12{
    private String name;

    public Client12(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}

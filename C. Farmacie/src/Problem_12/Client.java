package Problem_12;

public class Client implements Observer{
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String offer) {
        System.out.println("Hello " + name + ", new offer: " + offer);
    }
}

package Problem_2;

public class Autobuz implements MijlocTransport {
    private static Autobuz instance;

    private Autobuz() {}

    public static Autobuz getInstance() {
        if (instance == null) {
            instance = new Autobuz();
        }
        return instance;
    }

    public void drive() {
        System.out.println("Driving Autobuz");
    }
}

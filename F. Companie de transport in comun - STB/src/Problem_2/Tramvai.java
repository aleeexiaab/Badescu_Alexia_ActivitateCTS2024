package Problem_2;

public class Tramvai implements MijlocTransport {
    private static Tramvai instance;

    private Tramvai() {}

    public static Tramvai getInstance() {
        if (instance == null) {
            instance = new Tramvai();
        }
        return instance;
    }

    public void drive() {
        System.out.println("Driving Tramvai");
    }
}

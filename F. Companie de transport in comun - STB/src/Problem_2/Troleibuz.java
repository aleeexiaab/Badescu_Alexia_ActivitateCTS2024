package Problem_2;

public class Troleibuz implements MijlocTransport{
    private static Troleibuz instance;

    private Troleibuz() {}

    public static Troleibuz getInstance() {
        if (instance == null) {
            instance = new Troleibuz();
        }
        return instance;
    }

    public void drive() {
        System.out.println("Driving Troleibuz");
    }
}

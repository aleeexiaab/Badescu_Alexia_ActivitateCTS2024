package Problem_2;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz1 = MijlocTransportFactory.createTransport(TransportType.AUTOBUZ);
        MijlocTransport autobuz2 = MijlocTransportFactory.createTransport(TransportType.AUTOBUZ);
        MijlocTransport tramvai1 = MijlocTransportFactory.createTransport(TransportType.TRAMVAI);
        MijlocTransport tramvai2 = MijlocTransportFactory.createTransport(TransportType.TRAMVAI);
        MijlocTransport troleibuz1 = MijlocTransportFactory.createTransport(TransportType.TROLEIBUZ);
        MijlocTransport troleibuz2 = MijlocTransportFactory.createTransport(TransportType.TROLEIBUZ);

        autobuz1.drive();
        autobuz2.drive();
        tramvai1.drive();
        tramvai2.drive();
        troleibuz1.drive();
        troleibuz2.drive();

        System.out.println("Autobuz1 == Autobuz2: " + (autobuz1 == autobuz2));
        System.out.println("Tramvai1 == Tramvai2: " + (tramvai1 == tramvai2));
        System.out.println("Troleibuz1 == Troleibuz2: " + (troleibuz1 == troleibuz2));
    }
}

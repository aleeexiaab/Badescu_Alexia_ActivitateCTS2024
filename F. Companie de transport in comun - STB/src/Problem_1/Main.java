package Problem_1;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = MijlocTransportFactory.createTransport(TransportType.AUTOBUZ);
        MijlocTransport tramvai = MijlocTransportFactory.createTransport(TransportType.TRAMVAI);
        MijlocTransport troleibuz = MijlocTransportFactory.createTransport(TransportType.TROLEIBUZ);

        autobuz.drive();
        tramvai.drive();
        troleibuz.drive();
    }
}

package Problem_1;

public class MijlocTransportFactory {
    public static MijlocTransport createTransport(TransportType type) {
        switch (type) {
            case AUTOBUZ:
                return new Autobuz();
            case TRAMVAI:
                return new Tramvai();
            case TROLEIBUZ:
                return new Troleibuz();
            default:
                throw new IllegalArgumentException("Unknown transport type");
        }
    }
}

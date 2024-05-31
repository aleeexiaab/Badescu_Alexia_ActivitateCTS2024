package Problem_2;

public class MijlocTransportFactory {
    public static MijlocTransport createTransport(TransportType type) {
        switch (type) {
            case AUTOBUZ:
                return Autobuz.getInstance();
            case TRAMVAI:
                return Tramvai.getInstance();
            case TROLEIBUZ:
                return Troleibuz.getInstance();
            default:
                throw new IllegalArgumentException("Unknown transport type");
        }
    }
}

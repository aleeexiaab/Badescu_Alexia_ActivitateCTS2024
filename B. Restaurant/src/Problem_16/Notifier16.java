package Problem_16;

public interface Notifier16 {
    void setNext(Notifier16 nextNotifier);
    void notifyClient(Client16 client, String message);
}

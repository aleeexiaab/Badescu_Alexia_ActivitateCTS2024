package Problem_16;

public class ManagerNotifier16 implements Notifier16{
    @Override
    public void setNext(Notifier16 nextNotifier) {
    }

    @Override
    public void notifyClient(Client16 client, String message) {
        System.out.println("Notifying manager: No contact information for client " + client.getName());
    }
}

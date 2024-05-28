package Problem_16;

public class EmailNotifier16 implements Notifier16{
    private Notifier16 nextNotifier;

    @Override
    public void setNext(Notifier16 nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void notifyClient(Client16 client, String message) {
        if (client.getEmail() != null) {
            System.out.println("Sending email to " + client.getName() + ": " + message);
        } else if (nextNotifier != null) {
            nextNotifier.notifyClient(client, message);
        }
    }
}

package Problem_16;

public class Main16 {
    public static void main(String[] args) {
        Notifier16 smsNotifier = new SMSNotifier16();
        Notifier16 emailNotifier = new EmailNotifier16();
        Notifier16 managerNotifier = new ManagerNotifier16();

        smsNotifier.setNext(emailNotifier);
        emailNotifier.setNext(managerNotifier);

        Client16 client1 = new Client16("Client 1", "123456789", null);
        Client16 client2 = new Client16("Client 2", null, "client2@gmail.com");
        Client16 client3 = new Client16("Client 3", null, null);

        String message = "New offer available!";

        smsNotifier.notifyClient(client1, message);
        smsNotifier.notifyClient(client2, message);
        smsNotifier.notifyClient(client3, message);
    }
}

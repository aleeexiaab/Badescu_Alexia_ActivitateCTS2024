package Problem_10;

public class Main {
    public static void main(String[] args) {
        ClientFactory clientFactory = new ClientFactory();

        Client client1 = clientFactory.getClient("Client 1", "INS123456");
        Prescription prescription1 = new Prescription(client1, "RX1001", 150.0, 3);
        prescription1.showDetails();

        System.out.println();

        Client client2 = clientFactory.getClient("Cliet 2", "INS123456");
        Prescription prescription2 = new Prescription(client2, "RX1002", 200.0, 5);
        prescription2.showDetails();

        System.out.println();

        Client client3 = clientFactory.getClient("Client 3", "INS654321");
        Prescription prescription3 = new Prescription(client3, "RX1003", 120.0, 2);
        prescription3.showDetails();
    }
}

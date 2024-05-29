package Problem_12;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");

        pharmacy.subscribe(client1);
        pharmacy.subscribe(client2);

        pharmacy.newOffer("50% off on cold medicines");

        pharmacy.unsubscribe(client1);

        pharmacy.newOffer("30% off on pain relief medicines");
    }
}

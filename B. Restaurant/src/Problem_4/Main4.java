package Problem_4;

public class Main4 {
    public static void main(String[] args) {
        ClientCache4 clientCache = ClientCache4.getInstance();

        String email1 = "client1@gmail.com";
        String email2 = "client2@gmail.com";

        if (!clientCache.existsClient(email1)) {
            Client4 client1 = new Client4("Client1", email1);
            clientCache.addClient(client1);
            System.out.println("New client added: " + client1);
        } else {
            System.out.println("Existing client found: " + clientCache.getClient(email1));
        }

        if (!clientCache.existsClient(email1)) {
            Client4 client1 = new Client4("Client1", email1);
            clientCache.addClient(client1);
            System.out.println("New client added: " + client1);
        } else {
            System.out.println("Existing client found: " + clientCache.getClient(email1));
        }

        if (!clientCache.existsClient(email2)) {
            Client4 client2 = new Client4("Client2", email2);
            clientCache.addClient(client2);
            System.out.println("New client added: " + client2);
        } else {
            System.out.println("Existing client found: " + clientCache.getClient(email2));
        }
    }
}

package Problem_4;

public class Main {
    public static void main(String[] args) {
        try {
            Client originalClient = new Client("Client 1", "client.1@gmail.com", "123-456-7890");
            Client clonedClient = (Client) originalClient.clone();

            System.out.println("Original Client: " + originalClient);
            System.out.println("Cloned Client: " + clonedClient);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package Problem_11;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("Client is an individual:");
        client.setDocumentProcessingStrategy(new IndividualClientProcessingStrategy());
        client.processDocuments();

        System.out.println("\nClient is a business:");
        client.setDocumentProcessingStrategy(new BusinessClientProcessingStrategy());
        client.processDocuments();
    }
}

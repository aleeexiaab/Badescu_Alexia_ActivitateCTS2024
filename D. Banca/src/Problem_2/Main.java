package Problem_2;

public class Main {
    public static void main(String[] args) {
        ClientFactory individualFactory = new IndividualClientFactory();
        Client individual = individualFactory.createClient("Client 1", "123456");
        individual.getClientDetails();

        ClientFactory corporateFactory = new CorporateClientFactory();
        Client corporate = corporateFactory.createClient("Client 2", "987654321");
        corporate.getClientDetails();
    }
}

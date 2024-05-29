package Problem_2;

public class Main {
    public static void main(String[] args) {
        ClientFactory individualFactory = new IndividualClientFactory();
        Client individual = individualFactory.createClient("John Doe", "123456");
        individual.getClientDetails();

        ClientFactory corporateFactory = new CorporateClientFactory();
        Client corporate = corporateFactory.createClient("Acme Corp.", "987654321");
        corporate.getClientDetails();
    }
}

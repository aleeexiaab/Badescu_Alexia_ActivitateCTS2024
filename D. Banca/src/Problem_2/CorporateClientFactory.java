package Problem_2;

public class CorporateClientFactory implements ClientFactory{
    @Override
    public Client createClient(String companyName, String registrationNumber) {
        return new CorporateClient(companyName, registrationNumber);
    }

}

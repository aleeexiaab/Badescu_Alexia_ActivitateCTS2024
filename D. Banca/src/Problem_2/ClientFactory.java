package Problem_2;

public interface ClientFactory {
    Client createClient(String nameOrCompanyName, String idOrRegistrationNumber);
}

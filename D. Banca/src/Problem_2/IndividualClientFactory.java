package Problem_2;

public class IndividualClientFactory implements ClientFactory{
    @Override
    public Client createClient(String name, String id) {
        return new IndividualClient(name, id);
    }
}

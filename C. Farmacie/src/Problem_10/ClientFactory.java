package Problem_10;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private Map<String, Client> clients = new HashMap<>();

    public Client getClient(String name, String insuranceNumber) {
        String key = name + insuranceNumber;
        if (!clients.containsKey(key)) {
            clients.put(key, new Client(name, insuranceNumber));
        }
        return clients.get(key);
    }
}

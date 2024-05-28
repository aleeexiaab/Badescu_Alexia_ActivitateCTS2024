package Problem_4;

import java.util.HashMap;
import java.util.Map;

public class ClientCache4 {
    private Map<String, Client4> clientsCache;
    private static ClientCache4 instance;

    private ClientCache4() {
        clientsCache = new HashMap<>();
    }

    public static synchronized ClientCache4 getInstance() {
        if (instance == null) {
            instance = new ClientCache4();
        }
        return instance;
    }

    public Client4 getClient(String email) {
        return clientsCache.get(email);
    }

    public void addClient(Client4 client) {
        clientsCache.put(client.getEmail(), client);
    }

    public boolean existsClient(String email) {
        return clientsCache.containsKey(email);
    }
}

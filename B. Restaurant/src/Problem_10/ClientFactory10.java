package Problem_10;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory10 {
    private static Map<String, Client10> clients = new HashMap<>();

    public static Client10 getClient(String name, String phoneNumber, String email) {
        String key = name + phoneNumber + email;
        if (!clients.containsKey(key)) {
            clients.put(key, new Client10(name, phoneNumber, email));
        }
        return clients.get(key);
    }
}

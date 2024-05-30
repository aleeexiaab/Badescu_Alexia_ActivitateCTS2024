package Problem_10;

import java.util.HashMap;
import java.util.Map;

public class AccountHolderFactory {
    private Map<String, AccountHolder> accountHolders = new HashMap<>();

    public AccountHolder getAccountHolder(String name, String address, String phoneNumber, String email) {
        String key = name + address + phoneNumber + email;
        if (!accountHolders.containsKey(key)) {
            accountHolders.put(key, new AccountHolder(name, address, phoneNumber, email));
        }
        return accountHolders.get(key);
    }
}

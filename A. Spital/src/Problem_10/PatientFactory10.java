package Problem_10;

import java.util.HashMap;
import java.util.Map;

public class PatientFactory10 {
    private static Map<String, Patient10> patients = new HashMap<>();

    public static Patient10 getPatient(String name, String phoneNumber, String address) {
        String key = name + phoneNumber + address;
        if (!patients.containsKey(key)) {
            patients.put(key, new Patient10(name, phoneNumber, address));
        }
        return patients.get(key);
    }
}

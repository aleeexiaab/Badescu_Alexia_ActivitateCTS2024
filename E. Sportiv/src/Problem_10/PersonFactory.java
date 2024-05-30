package Problem_10;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

    private static final Map<String, Person> persons = new HashMap<>();

    public static Person getPerson(String height, String width, String shirtColor) {
        String key = height + width + shirtColor;
        if (!persons.containsKey(key)) {
            persons.put(key, new ConcretePerson(height, width, shirtColor));
        }
        return persons.get(key);
    }
}

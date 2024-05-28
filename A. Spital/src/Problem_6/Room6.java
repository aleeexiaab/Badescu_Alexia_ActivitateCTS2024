package Problem_6;

import java.util.ArrayList;
import java.util.List;

public class Room6 {
    private List<Boolean> beds;

    public Room6(int numberOfBeds) {
        beds = new ArrayList<>(numberOfBeds);
        for (int i = 0; i < numberOfBeds; i++) {
            beds.add(false);
        }
    }

    public boolean hasFreeBed() {
        return beds.contains(false);
    }

    public boolean occupyBed() {
        for (int i = 0; i < beds.size(); i++) {
            if (!beds.get(i)) {
                beds.set(i, true);
                return true;
            }
        }
        return false;
    }
}

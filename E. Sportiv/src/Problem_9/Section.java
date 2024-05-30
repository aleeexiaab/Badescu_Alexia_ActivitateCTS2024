package Problem_9;

import java.util.ArrayList;
import java.util.List;

public class Section implements SeatingComponent{
    private String name;
    private List<SeatingComponent> children = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public void add(SeatingComponent component) {
        children.add(component);
    }

    public void remove(SeatingComponent component) {
        children.remove(component);
    }

    @Override
    public void displaySeatInfo() {
        System.out.println("Section: " + name);
        for (SeatingComponent component : children) {
            component.displaySeatInfo();
        }
    }
}

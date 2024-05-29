package Problem_8;

import java.util.ArrayList;
import java.util.List;

public class MedicineSection implements MedicineComponent{
    private String name;
    private List<MedicineComponent> components = new ArrayList<>();

    public MedicineSection(String name) {
        this.name = name;
    }

    public void addComponent(MedicineComponent component) {
        components.add(component);
    }

    public void removeComponent(MedicineComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Section: " + name);
        for (MedicineComponent component : components) {
            component.showDetails();
        }
    }
}

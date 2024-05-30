package Problem_9;

import java.util.ArrayList;
import java.util.List;

public class Bank implements BankComponent{
    private String name;
    private List<BankComponent> components = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addComponent(BankComponent component) {
        components.add(component);
    }

    public void removeComponent(BankComponent component) {
        components.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bank: " + name);
        for (BankComponent component : components) {
            component.displayDetails();
        }
    }
}

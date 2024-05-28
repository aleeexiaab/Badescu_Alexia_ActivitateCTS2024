package Problem_8;

import java.util.ArrayList;
import java.util.List;

public class Menu8 implements MenuComponent8 {
    private String name;
    private List<MenuComponent8> menuComponents = new ArrayList<>();

    public Menu8(String name) {
        this.name = name;
    }

    public void add(MenuComponent8 menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent8 menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("Menu: " + name);
        for (MenuComponent8 component : menuComponents) {
            component.print();
        }
    }
}

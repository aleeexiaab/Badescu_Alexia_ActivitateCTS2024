package Problem_8;

import java.util.ArrayList;
import java.util.List;

public class Composite8 implements Component8 {
    private String name;
    private List<Component8> children = new ArrayList<>();

    public Composite8(String name) {
        this.name = name;
    }

    @Override
    public void add(Component8 component) {
        children.add(component);
    }

    @Override
    public void remove(Component8 component) {
        children.remove(component);
    }

    @Override
    public List<Component8> getChildren() {
        return children;
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Component8 child : children) {
            child.display();
        }
    }
}

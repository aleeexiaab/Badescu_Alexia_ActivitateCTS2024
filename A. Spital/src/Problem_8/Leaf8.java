package Problem_8;

import java.util.Collections;
import java.util.List;

public class Leaf8 implements Component8 {
    private String name;

    public Leaf8(String name) {
        this.name = name;
    }

    @Override
    public void add(Component8 component) {
        throw new UnsupportedOperationException("Leaf cannot add children");
    }

    @Override
    public void remove(Component8 component) {
        throw new UnsupportedOperationException("Leaf cannot remove children");
    }

    @Override
    public List<Component8> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}

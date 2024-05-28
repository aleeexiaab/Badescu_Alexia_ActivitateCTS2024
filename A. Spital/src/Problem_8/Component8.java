package Problem_8;

import java.util.List;

public interface Component8 {
    void add(Component8 component);
    void remove(Component8 component);
    List<Component8> getChildren();
    void display();
}
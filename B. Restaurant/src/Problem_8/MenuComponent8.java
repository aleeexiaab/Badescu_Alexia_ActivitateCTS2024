package Problem_8;

public interface MenuComponent8 {
    default void add(MenuComponent8 menuComponent) {
        throw new UnsupportedOperationException();
    }

    default void remove(MenuComponent8 menuComponent) {
        throw new UnsupportedOperationException();
    }
    void print();
}

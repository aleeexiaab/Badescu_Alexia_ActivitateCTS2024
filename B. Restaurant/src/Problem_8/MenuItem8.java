package Problem_8;

public class MenuItem8 implements MenuComponent8 {
    private String name;

    public MenuItem8(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Item: " + name);
    }
}

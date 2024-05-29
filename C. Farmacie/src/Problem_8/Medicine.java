package Problem_8;

public class Medicine implements MedicineComponent{
    private String name;

    public Medicine(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Medicine: " + name);
    }
}

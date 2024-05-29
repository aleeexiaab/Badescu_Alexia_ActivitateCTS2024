package Problem_1;

public class MedicineFactory {
    public static Medicine createMedicine(Category category, String name, double price) {
        switch (category) {
            case RACEALA:
                return new ColdMedicine(name, price);
            case DURERE:
                return new PainMedicine(name, price);
            case BODY:
                return new BodyMedicine(name, price);
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
}

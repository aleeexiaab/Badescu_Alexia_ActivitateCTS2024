package Problem_2;

public class FactoryProvider {
    public static MedicineFactory getFactory(Category category) {
        switch (category) {
            case RACEALA:
                return new ColdMedicineFactory();
            case DURERE:
                return new PainMedicineFactory();
            case BODY:
                return new BodyMedicineFactory();
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
}

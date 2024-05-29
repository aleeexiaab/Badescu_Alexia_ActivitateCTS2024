package Problem_2;

public class BodyMedicineFactory implements MedicineFactory{
    public Medicine createMedicine(String name, double price) {
        return new BodyMedicine(name, price);
    }
}

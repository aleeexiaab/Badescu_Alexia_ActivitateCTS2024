package Problem_2;

public class ColdMedicineFactory implements MedicineFactory{
    public Medicine createMedicine(String name, double price) {
        return new ColdMedicine(name, price);
    }
}

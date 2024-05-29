package Problem_2;

public class PainMedicineFactory implements MedicineFactory{
    public Medicine createMedicine(String name, double price) {
        return new PainMedicine(name, price);
    }
}

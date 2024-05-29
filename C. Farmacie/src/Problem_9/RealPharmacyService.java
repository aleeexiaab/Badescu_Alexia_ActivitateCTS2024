package Problem_9;

public class RealPharmacyService implements PharmacyService{
    @Override
    public void purchaseMedicine(String customerId, String prescriptionId, String medicineId, int quantity) {
        System.out.println("Medicine purchased: " + medicineId + ", Quantity: " + quantity + " for customer: " + customerId);
    }
}

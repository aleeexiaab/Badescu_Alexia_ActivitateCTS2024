package Problem_6;

public class InventorySystem {
    public boolean checkAvailability(String medicineId, int quantity) {
        return "med123".equals(medicineId) && quantity <= 100;
    }
}

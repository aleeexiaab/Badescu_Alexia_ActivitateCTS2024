package Problem_5;

public class InventoryAdapter {
    private InventoryManagementSystem inventorySystem;
    private String currentMedicineId;

    public InventoryAdapter(InventoryManagementSystem inventorySystem) {
        this.inventorySystem = inventorySystem;
    }

    public void setareMedicament(String id) {
        this.currentMedicineId = id;
    }

    public boolean verificareDisponibilitate(int quantity) {
        return inventorySystem.verificaStocPentruMedicament(currentMedicineId, quantity);
    }
}

package Problem_6;

public class PharmacyFacade {
    private PrescriptionSystem prescriptionSystem;
    private InventorySystem inventorySystem;
    private HealthCardSystem healthCardSystem;

    public PharmacyFacade() {
        this.prescriptionSystem = new PrescriptionSystem();
        this.inventorySystem = new InventorySystem();
        this.healthCardSystem = new HealthCardSystem();
    }

    public boolean verifyAll(String prescriptionId, String medicineId, int quantity, String healthCardId) {
        return prescriptionSystem.verifyPrescription(prescriptionId) &&
               inventorySystem.checkAvailability(medicineId, quantity) &&
               healthCardSystem.verifyHealthCard(healthCardId);
    }
}

package Problem_9;

public class PrescriptionProxy implements PharmacyService{
    private RealPharmacyService realPharmacyService;

    public PrescriptionProxy() {
        this.realPharmacyService = new RealPharmacyService();
    }

    @Override
    public void purchaseMedicine(String customerId, String prescriptionId, String medicineId, int quantity) {
        if (verifyPrescription(prescriptionId)) {
            realPharmacyService.purchaseMedicine(customerId, prescriptionId, medicineId, quantity);
        } else {
            System.out.println("Purchase denied. Prescription is required for customer: " + customerId);
        }
    }

    private boolean verifyPrescription(String prescriptionId) {
        // Mock verification logic
        return prescriptionId != null && !prescriptionId.isEmpty();
    }
}

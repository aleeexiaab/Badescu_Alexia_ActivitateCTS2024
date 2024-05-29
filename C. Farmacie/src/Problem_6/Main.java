package Problem_6;

public class Main {
    public static void main(String[] args) {
        PharmacyFacade facade = new PharmacyFacade();

        String prescriptionId = "pres123";
        String medicineId = "med123";
        int quantity = 50;
        String healthCardId = "card123";

        boolean canProceed = facade.verifyAll(prescriptionId, medicineId, quantity, healthCardId);

        System.out.println("Can proceed with purchase: " + canProceed); // Output: Can proceed with purchase: true
    }
}

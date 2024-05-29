package Problem_9;

public class Main {
    public static void main(String[] args) {
        PharmacyService pharmacyService = new PrescriptionProxy();

        pharmacyService.purchaseMedicine("cust123", "pres123", "med123", 10); // Valid prescription
        pharmacyService.purchaseMedicine("cust124", "", "med124", 5); // Invalid prescription
    }
}

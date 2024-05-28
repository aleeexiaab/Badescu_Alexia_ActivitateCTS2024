package Problem_5;

public class Main5 {
    public static void main(String[] args) {
        Medication5 hospitalMedication = new Medication5();
        PharmacyMedication5 pharmacyMedication = new PharmacyMedication5();

        System.out.println("Using Hospital Medication:");
        hospitalMedication.purchaseMedication();

        System.out.println("\nUsing Pharmacy Medication:");
        pharmacyMedication.buyMedication();

        MedicationAdapter5 adapter = new MedicationAdapter5(hospitalMedication);
        System.out.println("\nUsing Medication through Adapter:");
        adapter.buyMedication();
    }
}

package Problem_5;

public class Medication5 {
    public void purchaseMedication() {
        if (presentPrescription()) {
            System.out.println("Medication successfully purchased.");
        } else {
            System.out.println("Prescription is required to purchase this medication.");
        }
    }

    public boolean presentPrescription() {
        System.out.println("Prescription has been presented.");
        return true;
    }
}

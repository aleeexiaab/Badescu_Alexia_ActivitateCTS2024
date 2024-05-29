package Problem_15;

public class Main {
    public static void main(String[] args) {
        PharmacistAssistant assistant = new PharmacistAssistant();
        Pharmacist pharmacist = new Pharmacist(assistant);

        pharmacist.receivePrescription("Paracetamol");
        pharmacist.receivePrescription("Ibuprofen");
        pharmacist.receivePrescription("Aspirin");
    }
}

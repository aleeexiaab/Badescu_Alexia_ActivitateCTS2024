package Problem_10;

public class Prescription {
    private Client client;
    private String prescriptionNumber;
    private double amount;
    private int numberOfMedicines;

    public Prescription(Client client, String prescriptionNumber, double amount, int numberOfMedicines) {
        this.client = client;
        this.prescriptionNumber = prescriptionNumber;
        this.amount = amount;
        this.numberOfMedicines = numberOfMedicines;
    }

    public void showDetails() {
        System.out.println("Client Name: " + client.getName());
        System.out.println("Insurance Number: " + client.getInsuranceNumber());
        System.out.println("Prescription Number: " + prescriptionNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Number of Medicines: " + numberOfMedicines);
    }
}
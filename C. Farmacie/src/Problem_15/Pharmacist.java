package Problem_15;

public class Pharmacist {
    private PharmacistAssistant assistant;

    public Pharmacist(PharmacistAssistant assistant) {
        this.assistant = assistant;
    }

    public void receivePrescription(String medicineName) {
        Command command = new FetchMedicineCommand(medicineName);
        assistant.executeCommand(command);
        System.out.println("Prescription received for: " + medicineName);
    }
}

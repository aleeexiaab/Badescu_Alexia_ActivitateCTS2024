package Problem_15;

public class FetchMedicineCommand implements Command{
    private String medicineName;

    public FetchMedicineCommand(String medicineName) {
        this.medicineName = medicineName;
    }

    @Override
    public void execute() {
        System.out.println("Fetching medicine: " + medicineName);
    }
}

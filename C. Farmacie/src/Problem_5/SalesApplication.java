package Problem_5;

public class SalesApplication {
    private String currentMedicineId;

    public void setareMedicament(String id) {
        this.currentMedicineId = id;
    }

    public boolean verificareDisponibilitate(int quantity) {
        return "med123".equals(currentMedicineId) && quantity <= 100;
    }
}

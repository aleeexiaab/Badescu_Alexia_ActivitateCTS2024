package Problem_5;

public class MedicationAdapter5 extends PharmacyMedication5{
    private Medication5 medication;

    public MedicationAdapter5(Medication5 medication) {
        this.medication = medication;
    }

    @Override
    public void buyMedication() {
        medication.purchaseMedication();
    }
}

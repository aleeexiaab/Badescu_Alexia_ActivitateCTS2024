package Problem_14;

public class AvailabilityCheckHandler14 extends AbstractHandler14{
    @Override
    public void handle(Patient14 patient) {
        System.out.println("Checking availability for patient: " + patient.getName());
        passToNext(patient);
    }
}

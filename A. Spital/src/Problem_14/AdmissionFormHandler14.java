package Problem_14;

public class AdmissionFormHandler14 extends AbstractHandler14{
    @Override
    public void handle(Patient14 patient) {
        System.out.println("Issuing admission form for patient: " + patient.getName());
        passToNext(patient);
    }
}

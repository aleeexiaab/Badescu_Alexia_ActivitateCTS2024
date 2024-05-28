package Problem_15;

public class TreatPatientCommand15 implements Command15{
    private Doctor15 doctor;
    private String patientName;

    public TreatPatientCommand15(Doctor15 doctor, String patientName) {
        this.doctor = doctor;
        this.patientName = patientName;
    }

    @Override
    public void execute() {
        doctor.treatPatient(patientName);
    }
}

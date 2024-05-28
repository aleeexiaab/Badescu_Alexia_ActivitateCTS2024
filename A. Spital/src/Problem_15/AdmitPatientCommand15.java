package Problem_15;

public class AdmitPatientCommand15 implements Command15{
    private Doctor15 doctor;
    private String patientName;

    public AdmitPatientCommand15(Doctor15 doctor, String patientName) {
        this.doctor = doctor;
        this.patientName = patientName;
    }

    @Override
    public void execute() {
        doctor.admitPatient(patientName);
    }
}

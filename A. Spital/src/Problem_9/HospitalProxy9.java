package Problem_9;

public class HospitalProxy9 implements Hospital9{
    private RealHospital9 realHospital;

    public HospitalProxy9() {
        this.realHospital = new RealHospital9();
    }
    @Override
    public void admitPatient(Patient9 patient) {
        if (patient.hasHealthInsurance()) {
            realHospital.admitPatient(patient);
        } else {
            System.out.println("Patient " + patient.getName() + " cannot be admitted without health insurance.");
        }
    }
}

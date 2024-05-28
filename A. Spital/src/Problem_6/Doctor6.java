package Problem_6;

public class Doctor6 {
    public boolean confirmAdmission(Patient6 patient) {
        System.out.println("Doctor is confirming the admission for patient: " + patient.getName());
        return patient.requiresHospitalization();
    }
}

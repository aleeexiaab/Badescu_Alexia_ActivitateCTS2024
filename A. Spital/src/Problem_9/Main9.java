package Problem_9;

public class Main9 {
    public static void main(String[] args) {
        Patient9 patient1 = new Patient9("John Doe", true);
        Patient9 patient2 = new Patient9("Jane Smith", false);

        Hospital9 hospital = new HospitalProxy9();

        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);
    }
}

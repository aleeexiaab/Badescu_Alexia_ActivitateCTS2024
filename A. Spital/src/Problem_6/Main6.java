package Problem_6;

public class Main6 {
    public static void main(String[] args) {
        Doctor6 doctor = new Doctor6();
        Room6 room = new Room6(10);

        HospitalFacade6 hospital = new HospitalFacade6(doctor, room);

        Patient6 patient1 = new Patient6("Patient 1", "Severe", true);
        Patient6 patient2 = new Patient6("Patient 2", "Moderate", false);

        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);
    }
}

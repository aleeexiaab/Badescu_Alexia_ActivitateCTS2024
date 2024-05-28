package Problem_12;

public class Main12 {
    public static void main(String[] args) {
        Hospital12 hospital = new Hospital12();

        Patient12 patient1 = new Patient12("Patient 1", "123-456-7890");
        Patient12 patient2 = new Patient12("Patient 2", "098-765-4321");
        Patient12 patient3 = new Patient12("Patient 3", "555-555-5555");

        hospital.addObserver(patient1);
        hospital.addObserver(patient2);
        hospital.addObserver(patient3);

        hospital.newVirusAlert("COVID-19");
    }
}

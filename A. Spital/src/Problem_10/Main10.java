package Problem_10;

public class Main10 {
    public static void main(String[] args) {
        Patient10 patient1 = PatientFactory10.getPatient("Patient 1", "123-456-7890", "123 Main St");
        Patient10 patient2 = PatientFactory10.getPatient("Patient 2", "098-765-4321", "456 Second St");
        Patient10 patient3 = PatientFactory10.getPatient("Patient 1", "123-456-7890", "123 Main St");

        Hospitalization10 hospitalization1 = new Hospitalization10(patient1, "101", "15", 5);
        Hospitalization10 hospitalization2 = new Hospitalization10(patient2, "102", "20", 3);
        Hospitalization10 hospitalization3 = new Hospitalization10(patient3, "103", "10", 7);

        System.out.println(hospitalization1);
        System.out.println(hospitalization2);
        System.out.println(hospitalization3);

        System.out.println(patient1 == patient3);
    }
}

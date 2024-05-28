package Problem_1;

public class Main1 {
    public static void main(String[] args) {
        Patient1 patient1 = new Patient1.PatientBuilder("Patient 1")
                .setAdjustableBed(true)
                .setBreakfastIncluded(true)
                .build();

        Patient1 patient2 = new Patient1.PatientBuilder("Patient 2")
                .setRoomSlippers(true)
                .setIndoorGown(true)
                .build();

        Patient1 patient3 = new Patient1.PatientBuilder("Patient 3").build();

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);
    }
}

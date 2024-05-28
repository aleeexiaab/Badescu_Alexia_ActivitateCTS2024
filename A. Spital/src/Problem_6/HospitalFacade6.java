package Problem_6;

public class HospitalFacade6 {
    private Doctor6 doctor;
    private Room6 room;

    public HospitalFacade6(Doctor6 doctor, Room6 room) {
        this.doctor = doctor;
        this.room = room;
    }

    public boolean admitPatient(Patient6 patient) {
        System.out.println("Starting admission process for patient: " + patient.getName());

        if (patient.getCondition().equals("Severe")) {
            System.out.println("Patient condition is severe.");
            if (doctor.confirmAdmission(patient)) {
                System.out.println("Doctor has confirmed the admission.");
                if (room.hasFreeBed()) {
                    room.occupyBed();
                    System.out.println("Patient " + patient.getName() + " has been admitted.");
                    return true;
                } else {
                    System.out.println("No free beds available.");
                }
            } else {
                System.out.println("Doctor did not confirm the admission.");
            }
        } else {
            System.out.println("Patient condition is not severe enough for admission.");
        }
        return false;
    }
}

package Problem_3;

public class Main3 {
    public static void main(String[] args) {
        StaffFactory3 orderlyFactory = new OrderlyFactory3();
        HospitalStaff3 orderly = orderlyFactory.createStaff();
        orderly.performDuties();

        StaffFactory3 nurseFactory = new NurseFactory3();
        HospitalStaff3 nurse = nurseFactory.createStaff();
        nurse.performDuties();

        StaffFactory3 doctorFactory = new DoctorFactory3();
        HospitalStaff3 doctor = doctorFactory.createStaff();
        doctor.performDuties();
    }
}

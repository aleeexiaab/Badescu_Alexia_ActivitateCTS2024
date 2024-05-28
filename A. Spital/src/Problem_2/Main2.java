package Problem_2;

public class Main2 {
    public static void main(String[] args) {
        HospitalStaff2 orderly = HospitalStaffFactory2.createStaff(StaffType.ORDERLY);
        orderly.performDuties();

        HospitalStaff2 nurse = HospitalStaffFactory2.createStaff(StaffType.NURSE);
        nurse.performDuties();

        HospitalStaff2 doctor = HospitalStaffFactory2.createStaff(StaffType.DOCTOR);
        doctor.performDuties();
    }
}

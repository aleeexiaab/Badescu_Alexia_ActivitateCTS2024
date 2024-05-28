package Problem_2;

public class HospitalStaffFactory2 {
    public static HospitalStaff2 createStaff(StaffType type) {
        switch (type) {
            case ORDERLY:
                return new Orderly2();
            case NURSE:
                return new Nurse2();
            case DOCTOR:
                return new Doctor2();
            default:
                throw new IllegalArgumentException("Unknown staff type");
        }
    }
}

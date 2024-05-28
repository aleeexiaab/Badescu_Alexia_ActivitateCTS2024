package Problem_3;

public class DoctorFactory3 extends StaffFactory3{
    @Override
    public HospitalStaff3 createStaff() {
        return new Doctor3();
    }
}

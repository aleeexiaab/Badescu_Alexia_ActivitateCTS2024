package Problem_3;

public class NurseFactory3 extends StaffFactory3{
    @Override
    public HospitalStaff3 createStaff() {
        return new Nurse3();
    }
}

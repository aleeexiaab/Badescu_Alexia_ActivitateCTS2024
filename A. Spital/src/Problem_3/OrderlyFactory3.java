package Problem_3;

public class OrderlyFactory3 extends StaffFactory3 {
    @Override
    public HospitalStaff3 createStaff() {
        return new Orderly3();
    }
}

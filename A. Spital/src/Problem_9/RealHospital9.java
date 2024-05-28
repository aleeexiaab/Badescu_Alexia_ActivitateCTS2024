package Problem_9;

public class RealHospital9 implements Hospital9{

    @Override
    public void admitPatient(Patient9 patient) {
        System.out.println("Patient " + patient.getName() + " has been admitted to the hospital.");
    }
}

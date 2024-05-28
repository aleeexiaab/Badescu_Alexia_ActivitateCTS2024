package Problem_15;

public class Doctor15 {
    private String name;

    public Doctor15(String name) {
        this.name = name;
    }

    public void admitPatient(String patientName) {
        System.out.println(name + " is admitting patient: " + patientName);
    }

    public void treatPatient(String patientName) {
        System.out.println(name + " is treating patient: " + patientName);
    }
}

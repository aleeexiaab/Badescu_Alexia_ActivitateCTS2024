package Problem_13;

public class ExternatState13 implements State13{
    @Override
    public void handle(Patient13 patient) {
        System.out.println("Patient is already discharged.");
    }

    @Override
    public String getStateName() {
        return "Externat";
    }
}

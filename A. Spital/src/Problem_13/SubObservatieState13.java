package Problem_13;

public class SubObservatieState13 implements State13{
    @Override
    public void handle(Patient13 patient) {
        System.out.println("Patient is now discharged.");
        patient.setState(new ExternatState13());
    }

    @Override
    public String getStateName() {
        return "SubObservatie";
    }
}

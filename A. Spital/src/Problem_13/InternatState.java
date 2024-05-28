package Problem_13;

public class InternatState implements State13{
    @Override
    public void handle(Patient13 patient) {
        System.out.println("Patient is now under observation.");
        patient.setState(new SubObservatieState13());
    }

    @Override
    public String getStateName() {
        return "Internat";
    }
}

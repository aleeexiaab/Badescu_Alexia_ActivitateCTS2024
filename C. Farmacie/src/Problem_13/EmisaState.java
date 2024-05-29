package Problem_13;

public class EmisaState implements PrescriptionState{
    @Override
    public void handleRequest(PrescriptionContext context) {
        context.setState(new SolicitataState());
    }

    @Override
    public String getStateName() {
        return "Emisa";
    }
}

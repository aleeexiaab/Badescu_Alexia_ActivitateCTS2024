package Problem_13;

public class SolicitataState implements PrescriptionState{
    @Override
    public void handleRequest(PrescriptionContext context) {
        context.setState(new AchizitionataState());
    }

    @Override
    public String getStateName() {
        return "Solicitata";
    }
}

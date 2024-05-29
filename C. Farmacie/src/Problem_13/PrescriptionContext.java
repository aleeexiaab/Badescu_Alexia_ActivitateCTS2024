package Problem_13;

public class PrescriptionContext {
    private PrescriptionState state;

    public PrescriptionContext() {
        state = new EmisaState();
    }

    public void setState(PrescriptionState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }

    public String getStateName() {
        return state.getStateName();
    }
}

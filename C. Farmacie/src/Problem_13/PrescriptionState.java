package Problem_13;

public interface PrescriptionState {
    void handleRequest(PrescriptionContext context);
    String getStateName();
}

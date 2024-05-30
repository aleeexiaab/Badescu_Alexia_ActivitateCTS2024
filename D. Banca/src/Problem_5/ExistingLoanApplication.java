package Problem_5;

public class ExistingLoanApplication {
    private String clientName;
    private double amount;
    private int duration;

    public ExistingLoanApplication(String clientName, double amount, int duration) {
        this.clientName = clientName;
        this.amount = amount;
        this.duration = duration;
    }

    public String getClientName() {
        return clientName;
    }

    public double getAmount() {
        return amount;
    }

    public int getDuration() {
        return duration;
    }
}

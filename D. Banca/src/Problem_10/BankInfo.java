package Problem_10;

public class BankInfo {
    private String bankName;
    private String branch;
    private double capital;

    public BankInfo(String bankName, String branch, double capital) {
        this.bankName = bankName;
        this.branch = branch;
        this.capital = capital;
    }

    public void display() {
        System.out.println("Bank: " + bankName + ", Branch: " + branch + ", Capital: " + capital);
    }
}

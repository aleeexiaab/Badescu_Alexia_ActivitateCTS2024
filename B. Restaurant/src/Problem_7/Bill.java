package Problem_7;

public class Bill implements IBill{
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println("Bill amount:" + amount);
    }
}

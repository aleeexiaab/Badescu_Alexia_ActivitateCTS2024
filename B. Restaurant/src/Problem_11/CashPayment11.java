package Problem_11;

public class CashPayment11 implements PaymentStrategy11{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}

package Problem_11;

public class Client11 {
    private String name;
    private PaymentStrategy11 paymentStrategy;

    public Client11(String name) {
        this.name = name;
    }

    public void setPaymentStrategy(PaymentStrategy11 paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payBill(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Payment strategy not set for client " + name);
        }
    }
}

package Problem_11;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CardPayment());
        paymentContext.executePayment(100.0);

        paymentContext.setPaymentStrategy(new CashPayment());
        paymentContext.executePayment(50.0);
    }
}

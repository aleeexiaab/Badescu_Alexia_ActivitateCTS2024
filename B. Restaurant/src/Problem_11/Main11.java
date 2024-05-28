package Problem_11;

public class Main11 {
    public static void main(String[] args) {
        Client11 client1 = new Client11("Client 1");
        Client11 client2 = new Client11("Client 2");

        client1.setPaymentStrategy(new CardPayment11("1234-5678-9012-3456", "Client 1"));
        client2.setPaymentStrategy(new CashPayment11());

        client1.payBill(50.0);
        client2.payBill(30.0);
    }
}

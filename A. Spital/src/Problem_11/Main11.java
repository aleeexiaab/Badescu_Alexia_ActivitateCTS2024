package Problem_11;

public class Main11 {
    public static void main(String[] args) {

        Patient11 patient1 = new Patient11("Patient 1");
        Patient11 patient2 = new Patient11("Patient 2");

        patient1.setPaymentStrategy(new CardPayment11("1234-5678-9101-1121", "Patient 1"));
        patient2.setPaymentStrategy(new CashPayment11());

        patient1.payBill(250.0);
        patient2.payBill(150.0);
    }
}

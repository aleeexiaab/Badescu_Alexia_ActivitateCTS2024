package Problem_7;

public class Main7 {
    public static void main(String[] args) {

        Patient7 patient1 = new Patient7("Patient 1");
        Patient7 patient2 = new Patient7("Patient 2");


        patient1.setDeliveryStrategy(new OnlineDeliveryStrategy7());
        patient2.setDeliveryStrategy(new PrintedDeliveryStrategy7());


        patient1.deliverResults();
        patient2.deliverResults();


        patient1.setDeliveryStrategy(new PrintedDeliveryStrategy7());
        patient1.deliverResults();
    }
}

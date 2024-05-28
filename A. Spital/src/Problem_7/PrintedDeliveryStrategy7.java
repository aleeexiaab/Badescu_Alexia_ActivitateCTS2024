package Problem_7;

public class PrintedDeliveryStrategy7 implements ResultDeliveryStrategy7{
    @Override
    public void deliverResults(Patient7 patient) {
        System.out.println("Delivering printed results to patient: " + patient.getName());
    }
}

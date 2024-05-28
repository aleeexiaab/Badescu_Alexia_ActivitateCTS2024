package Problem_7;

public class OnlineDeliveryStrategy7 implements ResultDeliveryStrategy7{
    @Override
    public void deliverResults(Patient7 patient) {
        System.out.println("Delivering online results to patient: " + patient.getName());
    }
}

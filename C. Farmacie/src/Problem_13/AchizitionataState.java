package Problem_13;

public class AchizitionataState implements PrescriptionState{
    @Override
    public void handleRequest(PrescriptionContext context) {
        System.out.println("Medicamentele au fost achizitionate. Nu mai pot fi schimbate.");
    }

    @Override
    public String getStateName() {
        return "Achizitionata";
    }
}

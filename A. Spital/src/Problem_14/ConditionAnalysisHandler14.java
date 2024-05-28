package Problem_14;

public class ConditionAnalysisHandler14 extends AbstractHandler14{
    @Override
    public void handle(Patient14 patient) {
        System.out.println("Analyzing condition of patient: " + patient.getName());
        passToNext(patient);
    }
}

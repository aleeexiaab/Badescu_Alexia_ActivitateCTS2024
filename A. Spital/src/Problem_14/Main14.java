package Problem_14;

public class Main14 {
    public static void main(String[] args) {

        Handler14 conditionAnalysisHandler = new ConditionAnalysisHandler14();
        Handler14 availabilityCheckHandler = new AvailabilityCheckHandler14();
        Handler14 admissionFormHandler = new AdmissionFormHandler14();

        conditionAnalysisHandler.setNext(availabilityCheckHandler);
        availabilityCheckHandler.setNext(admissionFormHandler);

        Patient14 patient = new Patient14("Patient 1", "Severe Condition");

        conditionAnalysisHandler.handle(patient);
    }
}

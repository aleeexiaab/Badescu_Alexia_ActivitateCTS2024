package Problem_15;

public class Main15 {
    public static void main(String[] args) {
        Doctor15 doctorSmith = new Doctor15("Dr. Smith");
        Doctor15 doctorJones = new Doctor15("Dr. Jones");

        Command15 admitPatient = new AdmitPatientCommand15(doctorSmith, "Patient 1");
        Command15 treatPatient = new TreatPatientCommand15(doctorJones, "Patient 2");

        ReceptionOperator15 operator = new ReceptionOperator15();
        operator.takeCommand(admitPatient);
        operator.takeCommand(treatPatient);

        operator.processCommands();
    }
}

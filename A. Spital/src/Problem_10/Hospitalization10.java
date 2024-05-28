package Problem_10;

public class Hospitalization10 {
    private Patient10 patient;
    private String wardNumber;
    private String bedNumber;
    private int daysHospitalized;

    public Hospitalization10(Patient10 patient, String wardNumber, String bedNumber, int daysHospitalized) {
        this.patient = patient;
        this.wardNumber = wardNumber;
        this.bedNumber = bedNumber;
        this.daysHospitalized = daysHospitalized;
    }

    public Patient10 getPatient() {
        return patient;
    }

    public String getWardNumber() {
        return wardNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public int getDaysHospitalized() {
        return daysHospitalized;
    }

    @Override
    public String toString() {
        return "Hospitalization{" +
                "patient=" + patient +
                ", wardNumber='" + wardNumber + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                ", daysHospitalized=" + daysHospitalized +
                '}';
    }
}

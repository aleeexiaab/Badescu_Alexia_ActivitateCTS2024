package Problem_10;

public class Client {
    private String name;
    private String insuranceNumber;

    public Client(String name, String insuranceNumber) {
        this.name = name;
        this.insuranceNumber = insuranceNumber;
    }

    public String getName() {
        return name;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
}

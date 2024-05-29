package Problem_2;

public class CorporateClient implements Client{
    private String companyName;
    private String registrationNumber;

    public CorporateClient(String companyName, String registrationNumber) {
        this.companyName = companyName;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public void getClientDetails() {
        System.out.println("Corporate Client: Company Name = " + companyName + ", Registration Number = " + registrationNumber);
    }
}

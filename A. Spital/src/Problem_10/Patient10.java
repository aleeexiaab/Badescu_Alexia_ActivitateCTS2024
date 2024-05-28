package Problem_10;

public class Patient10 {
    private String name;
    private String phoneNumber;
    private String address;

    public Patient10(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', phoneNumber='" + phoneNumber + "', address='" + address + "'}";
    }
}

package Problem_10;

public class Client10 {
    private String name;
    private String phoneNumber;
    private String email;

    public Client10(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{name='" + name + "', phoneNumber='" + phoneNumber + "', email='" + email + "'}";
    }
}

package Problem_10;

public class AccountHolder {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public AccountHolder(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void display() {
        System.out.println("Account Holder: " + name + ", Address: " + address + ", Phone: " + phoneNumber + ", Email: " + email);
    }
}

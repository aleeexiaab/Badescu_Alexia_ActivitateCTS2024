package Problem_12;

public class Patient12 implements Observer12{

    private String name;
    private String phoneNumber;

    public Patient12(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void update(String message) {
        System.out.println("Notifying " + name + " at " + phoneNumber + ": " + message);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

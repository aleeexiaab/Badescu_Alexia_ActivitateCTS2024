package Problem_4;

public class Client implements Cloneable{
    private String name;
    private String idCard;
    private String creditCard;

    public Client(String name, String idCard, String creditCard) {
        this.name = name;
        this.idCard = idCard;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    @Override
    protected Client clone() throws CloneNotSupportedException {
        return (Client) super.clone();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + this.getName() + '\'' +
                ", idCard='" + this.getIdCard() + '\'' +
                ", creditCard='" + this.getCreditCard() + '\'' +
                '}';
    }
}

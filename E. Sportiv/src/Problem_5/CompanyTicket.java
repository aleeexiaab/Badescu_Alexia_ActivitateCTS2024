package Problem_5;

public class CompanyTicket {
    private String match;
    private String seat;
    private double price;

    public CompanyTicket(String match, String seat, double price) {
        this.match = match;
        this.seat = seat;
        this.price = price;
    }

    public String getMatch() {
        return match;
    }

    public String getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }
}

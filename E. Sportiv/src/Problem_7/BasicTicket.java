package Problem_7;

public class BasicTicket implements Ticket{
    private String match;
    private String seat;
    private double price;

    public BasicTicket(String match, String seat, double price) {
        this.match = match;
        this.seat = seat;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Match: " + match);
        System.out.println("Seat: " + seat);
        System.out.println("Price: " + price);
    }

    public String getMatch() {
        return match;
    }
}

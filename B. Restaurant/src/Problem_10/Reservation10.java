package Problem_10;

public class Reservation10 {
    private Client10 client;
    private int tableNumber;
    private int numberOfPeople;
    private String reservationTime;

    public Reservation10(Client10 client, int tableNumber, int numberOfPeople, String reservationTime) {
        this.client = client;
        this.tableNumber = tableNumber;
        this.numberOfPeople = numberOfPeople;
        this.reservationTime = reservationTime;
    }

    @Override
    public String toString() {
        return "Reservation{client=" + client + ", tableNumber=" + tableNumber + ", numberOfPeople=" + numberOfPeople + ", reservationTime='" + reservationTime + "'}";
    }
}

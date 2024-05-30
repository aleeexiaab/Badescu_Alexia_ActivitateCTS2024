package Problem_9;

public class Seat implements SeatingComponent{
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void displaySeatInfo() {
        System.out.println("Seat: " + seatNumber);
    }
}

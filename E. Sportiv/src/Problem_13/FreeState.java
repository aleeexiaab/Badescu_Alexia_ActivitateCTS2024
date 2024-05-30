package Problem_13;

public class FreeState implements SeatState{
    @Override
    public void reserve(Seat seat) {
        System.out.println("Reserving the seat.");
        seat.setState(new ReservedState());
    }

    @Override
    public void occupy(Seat seat) {
        System.out.println("Occupying the seat.");
        seat.setState(new OccupiedState());
    }

    @Override
    public void free(Seat seat) {
        System.out.println("The seat is already free.");
    }
}

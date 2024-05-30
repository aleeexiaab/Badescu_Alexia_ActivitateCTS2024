package Problem_13;

public class ReservedState implements SeatState {
    @Override
    public void reserve(Seat seat) {
        System.out.println("The seat is already reserved.");
    }

    @Override
    public void occupy(Seat seat) {
        System.out.println("Occupying the reserved seat.");
        seat.setState(new OccupiedState());
    }

    @Override
    public void free(Seat seat) {
        System.out.println("Freeing the reserved seat.");
        seat.setState(new FreeState());
    }
}

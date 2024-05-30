package Problem_13;

public class OccupiedState implements SeatState{
    @Override
    public void reserve(Seat seat) {
        System.out.println("The seat is occupied and cannot be reserved.");
    }

    @Override
    public void occupy(Seat seat) {
        System.out.println("The seat is already occupied.");
    }

    @Override
    public void free(Seat seat) {
        System.out.println("Freeing the occupied seat.");
        seat.setState(new FreeState());
    }
}

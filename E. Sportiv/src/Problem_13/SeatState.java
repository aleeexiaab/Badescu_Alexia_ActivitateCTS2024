package Problem_13;

public interface SeatState {
    void reserve(Seat seat);
    void occupy(Seat seat);
    void free(Seat seat);
}

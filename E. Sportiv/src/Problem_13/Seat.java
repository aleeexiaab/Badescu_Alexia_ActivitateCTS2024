package Problem_13;

public class Seat {
    private SeatState state;

    public Seat() {
        state = new FreeState();
    }

    public void setState(SeatState state) {
        this.state = state;
    }

    public void reserve() {
        state.reserve(this);
    }

    public void occupy() {
        state.occupy(this);
    }

    public void free() {
        state.free(this);
    }
}

package Problem_13;

public class Table13 {
    private TableState13 state;

    public Table13() {
        state = new FreeState13();
    }

    public void setState(TableState13 state) {
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

    @Override
    public String toString() {
        return "Table is currently " + state.getClass().getSimpleName();
    }
}

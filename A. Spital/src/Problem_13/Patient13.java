package Problem_13;

public class Patient13 {
    private State13 state;

    public Patient13() {
        state = new InternatState();
    }

    public void setState(State13 state) {
        this.state = state;
    }

    public void proceed() {
        state.handle(this);
    }

    public void printState() {
        System.out.println("Current state: " + state.getStateName());
    }
}

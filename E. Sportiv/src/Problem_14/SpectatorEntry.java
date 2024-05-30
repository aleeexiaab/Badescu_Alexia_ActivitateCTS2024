package Problem_14;

public class SpectatorEntry extends StadiumEntry{
    @Override
    protected void queueUp() {
        System.out.println("Queueing up.");
    }

    @Override
    protected void presentTicket() {
        System.out.println("Presenting ticket.");
    }

    @Override
    protected void bodyCheck() {
        System.out.println("Performing body check.");
    }

    @Override
    protected void enter() {
        System.out.println("Entering stadium.");
    }

    @Override
    protected void occupySeat() {
        System.out.println("Occupying seat.");
    }
}

package Problem_14;

public abstract class StadiumEntry {
    public final void enterStadium() {
        queueUp();
        presentTicket();
        bodyCheck();
        enter();
        occupySeat();
    }

    protected abstract void queueUp();
    protected abstract void presentTicket();
    protected abstract void bodyCheck();
    protected abstract void enter();
    protected abstract void occupySeat();
}

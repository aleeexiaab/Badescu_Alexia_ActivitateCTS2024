package Problem_14;

public abstract class AbstractHandler14 implements Handler14{
    protected Handler14 next;

    @Override
    public void setNext(Handler14 handler) {
        this.next = handler;
    }

    protected void passToNext(Patient14 patient) {
        if (next != null) {
            next.handle(patient);
        }
    }
}

package Problem_7;

public class TicketDecorator implements Ticket{
    protected Ticket decoratedTicket;

    public TicketDecorator(Ticket decoratedTicket) {
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public void print() {
        decoratedTicket.print();
    }
}

package Problem_7;

public class HomeTeamSupportMessageDecorator extends TicketDecorator{
    public HomeTeamSupportMessageDecorator(Ticket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void print() {
        decoratedTicket.print();
        addSupportMessage();
    }

    private void addSupportMessage() {
        System.out.println("Go Home Team! Support your local heroes!");
    }
}

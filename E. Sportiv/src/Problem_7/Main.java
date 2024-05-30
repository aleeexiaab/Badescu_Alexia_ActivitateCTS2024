package Problem_7;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new BasicTicket("Local Team vs Opponent Team", "A12", 50.0);
        Ticket ticket2 = new BasicTicket("Visitor Team vs Another Team", "B15", 75.0);

        Ticket decoratedTicket1 = new HomeTeamSupportMessageDecorator(ticket1);
        Ticket decoratedTicket2 = ticket2;

        decoratedTicket1.print();
        System.out.println();
        decoratedTicket2.print();
    }
}

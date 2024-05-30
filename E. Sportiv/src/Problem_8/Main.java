package Problem_8;

public class Main {
    public static void main(String[] args) {
        TicketSale ticketSale = new TicketSaleProxy();

        ticketSale.sellTicket("Person 1", 16);
        ticketSale.sellTicket("Person 2", 12);
    }
}

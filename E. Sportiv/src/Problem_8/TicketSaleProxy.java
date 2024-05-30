package Problem_8;

public class TicketSaleProxy implements TicketSale{
    private TicketSaleImpl ticketSale;

    public TicketSaleProxy() {
        this.ticketSale = new TicketSaleImpl();
    }

    @Override
    public void sellTicket(String customerName, int customerAge) {
        if (customerAge >= 14) {
            ticketSale.sellTicket(customerName, customerAge);
        } else {
            System.out.println("Ticket cannot be sold to " + customerName + ". Minimum age is 14.");
        }
    }
}

package Problem_8;

public class TicketSaleImpl implements TicketSale{
    @Override
    public void sellTicket(String customerName, int customerAge) {
        System.out.println("Ticket sold to " + customerName);
    }
}

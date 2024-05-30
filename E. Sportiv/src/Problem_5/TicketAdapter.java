package Problem_5;

public class TicketAdapter implements Ticket {
    private CompanyTicket companyTicket;

    public TicketAdapter(CompanyTicket companyTicket) {
        this.companyTicket = companyTicket;
    }

    @Override
    public String getEvent() {
        return companyTicket.getMatch();
    }

    @Override
    public String getLocation() {
        return companyTicket.getSeat();
    }

    @Override
    public double getCost() {
        return companyTicket.getPrice();
    }
}

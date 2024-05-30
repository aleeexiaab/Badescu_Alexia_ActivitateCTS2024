package Problem_5;

public class Main {
    public static void main(String[] args) {
        CompanyTicket companyTicket = new CompanyTicket("Football Match", "A12", 100.0);
        Ticket eBiletTicket = new TicketAdapter(companyTicket);

        System.out.println("Event: " + eBiletTicket.getEvent());
        System.out.println("Location: " + eBiletTicket.getLocation());
        System.out.println("Cost: " + eBiletTicket.getCost());
    }
}

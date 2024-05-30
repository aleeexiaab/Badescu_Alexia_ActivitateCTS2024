package Problem_12;

public class Main {
    public static void main(String[] args) {
        SportsHall sportsHall = new SportsHall();

        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");
        Client client3 = new Client("Charlie");

        sportsHall.subscribe(client1);
        sportsHall.subscribe(client2);
        sportsHall.subscribe(client3);

        sportsHall.newMatchScheduled("football");
        sportsHall.newMatchScheduled("handball");
        sportsHall.newMatchScheduled("volleyball");
    }
}

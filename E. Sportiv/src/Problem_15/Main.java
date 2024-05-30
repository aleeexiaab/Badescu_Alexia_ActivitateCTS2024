package Problem_15;

public class Main {
    public static void main(String[] args) {
        Match match = new Match();
        Caretaker caretaker = new Caretaker();

        match.setState("2024-05-30", "Team A vs Team B", 20000);
        match.printState();
        caretaker.add(match.saveStateToMemento());

        match.setState("2024-06-15", "Team C vs Team D", 15000);
        match.printState();
        caretaker.add(match.saveStateToMemento());

        match.setState("2024-07-05", "Team E vs Team F", 18000);
        match.printState();
        caretaker.add(match.saveStateToMemento());

        match.getStateFromMemento(caretaker.get(0));
        match.printState();

        match.getStateFromMemento(caretaker.get(1));
        match.printState();
    }
}

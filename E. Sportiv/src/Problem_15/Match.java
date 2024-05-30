package Problem_15;

public class Match {
    private String date;
    private String teams;
    private int spectators;

    public void setState(String date, String teams, int spectators) {
        this.date = date;
        this.teams = teams;
        this.spectators = spectators;
    }

    public MatchMemento saveStateToMemento() {
        return new MatchMemento(date, teams, spectators);
    }

    public void getStateFromMemento(MatchMemento memento) {
        date = memento.getDate();
        teams = memento.getTeams();
        spectators = memento.getSpectators();
    }

    public void printState() {
        System.out.println("Date: " + date + ", Teams: " + teams + ", Spectators: " + spectators);
    }
}

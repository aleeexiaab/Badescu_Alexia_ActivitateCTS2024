package Problem_15;

public class MatchMemento {
    private final String date;
    private final String teams;
    private final int spectators;

    public MatchMemento(String date, String teams, int spectators) {
        this.date = date;
        this.teams = teams;
        this.spectators = spectators;
    }

    public String getDate() {
        return date;
    }

    public String getTeams() {
        return teams;
    }

    public int getSpectators() {
        return spectators;
    }
}

package Problem_2;

public class Main {
    public static void main(String[] args) {
        PlayerFactory goalkeeperFactory = new GoalkeeperFactory();
        PlayerFactory defenderFactory = new DefenderFactory();
        PlayerFactory strikerFactory = new StrikerFactory();

        Player goalkeeper = (Goalkeeper) goalkeeperFactory.createPlayer("John Doe");
        Player defender = defenderFactory.createPlayer("Jane Smith");
        Player striker = strikerFactory.createPlayer("Mike Johnson");

        goalkeeper.play();
        defender.play();
        striker.play();
    }
}

package Problem_1;

public class Main {
    public static void main(String[] args) {
        Player1 goalkeeper = PlayerFactory1.createPlayer(PlayerType1.GOALKEEPER, "John Doe");
        Player1 defender = PlayerFactory1.createPlayer(PlayerType1.DEFENDER, "Jane Smith");
        Player1 striker = PlayerFactory1.createPlayer(PlayerType1.STRIKER, "Mike Johnson");

        goalkeeper.play();
        defender.play();
        striker.play();
    }
}

package Problem_2;

public class StrikerFactory implements PlayerFactory{
    @Override
    public Player createPlayer(String name) {
        return new Striker(name);
    }
}

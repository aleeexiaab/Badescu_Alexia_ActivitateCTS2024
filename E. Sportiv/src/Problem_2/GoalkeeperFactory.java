package Problem_2;

public class GoalkeeperFactory implements PlayerFactory{
    @Override
    public Goalkeeper createPlayer(String name) {
        return new Goalkeeper(name);
    }
}

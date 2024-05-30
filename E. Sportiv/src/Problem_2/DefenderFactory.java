package Problem_2;

public class DefenderFactory implements PlayerFactory{
    @Override
    public Player createPlayer(String name) {
        return new Defender(name);
    }
}

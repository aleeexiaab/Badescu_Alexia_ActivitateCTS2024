package Problem_1;

public class PlayerFactory1 {
    public static Player1 createPlayer(PlayerType1 type, String name) {
        switch (type) {
            case GOALKEEPER:
                return new Goalkeeper1(name);
            case DEFENDER:
                return new Defender1(name);
            case STRIKER:
                return new Striker1(name);
            default:
                throw new IllegalArgumentException("Unknown player type: " + type);
        }
    }
}

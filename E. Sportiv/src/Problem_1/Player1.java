package Problem_1;

public abstract class Player1 {
    private String name;

    public Player1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();
}

package Problem_2;

public class Striker extends Player {
    public Striker(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing as a striker.");
    }
}

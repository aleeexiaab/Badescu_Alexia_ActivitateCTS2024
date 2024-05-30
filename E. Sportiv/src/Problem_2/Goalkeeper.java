package Problem_2;

public class Goalkeeper extends Player{
    public Goalkeeper(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing as a goalkeeper.");
    }
}

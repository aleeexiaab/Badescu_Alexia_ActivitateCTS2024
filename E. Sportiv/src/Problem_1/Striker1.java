package Problem_1;

public class Striker1 extends Player1 {

    public Striker1(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing as a striker.");
    }
}

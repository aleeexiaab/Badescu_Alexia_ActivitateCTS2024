package Problem_1;

public class Defender1 extends Player1 {

    public Defender1(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing as a defender.");
    }
}

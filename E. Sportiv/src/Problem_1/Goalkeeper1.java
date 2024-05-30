package Problem_1;

public class Goalkeeper1 extends Player1 {
    public Goalkeeper1(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing as a goalkeeper.");
    }
}

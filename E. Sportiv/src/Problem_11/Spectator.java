package Problem_11;

public class Spectator {
    private CheckStrategy checkStrategy;

    public void setCheckStrategy(CheckStrategy checkStrategy) {
        this.checkStrategy = checkStrategy;
    }

    public void performCheck() {
        if (checkStrategy != null) {
            checkStrategy.check();
        } else {
            System.out.println("No check strategy set.");
        }
    }
}

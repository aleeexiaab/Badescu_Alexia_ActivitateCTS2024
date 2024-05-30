package Problem_6;

public class Main {
    public static void main(String[] args) {
        StadiumEntranceFacade entranceFacade = new StadiumEntranceFacade();
        boolean canEnter = entranceFacade.checkEntrance("123456", "TICKET123");

        System.out.println("Can enter: " + canEnter);
    }
}

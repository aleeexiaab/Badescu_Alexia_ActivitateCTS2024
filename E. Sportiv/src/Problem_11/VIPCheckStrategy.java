package Problem_11;

public class VIPCheckStrategy implements CheckStrategy{
    @Override
    public void check() {
        System.out.println("Checking ticket only for VIP spectator.");
    }
}

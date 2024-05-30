package Problem_11;

public class Main {
    public static void main(String[] args) {
        Spectator vipSpectator = new Spectator();
        Spectator tribunaSpectator = new Spectator();
        Spectator peluzaSpectator = new Spectator();

        vipSpectator.setCheckStrategy(new VIPCheckStrategy());
        tribunaSpectator.setCheckStrategy(new TribunaCheckStrategy());
        peluzaSpectator.setCheckStrategy(new PeluzaCheckStrategy());

        System.out.println("VIP Spectator:");
        vipSpectator.performCheck();

        System.out.println("\nTribuna Spectator:");
        tribunaSpectator.performCheck();

        System.out.println("\nPeluza Spectator:");
        peluzaSpectator.performCheck();
    }
}

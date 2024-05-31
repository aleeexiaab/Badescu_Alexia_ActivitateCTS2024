package Problem_3;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuzLinie1 = new AutobuzLinie.Builder("ModelX", "John")
                .opririLaCapatDeLinie(false)
                .textAfisat("Welcome")
                .build();

        AutobuzLinie autobuzLinie2 = new AutobuzLinie.Builder("ModelY", "Smith")
                .deschideUsiInFiecareStatie(false)
                .alteElemente(5)
                .build();

        System.out.println("AutobuzLinie1: Model = " + autobuzLinie1.getModel() + ", Sofer = " + autobuzLinie1.getSofer());
        System.out.println("AutobuzLinie2: Model = " + autobuzLinie2.getModel() + ", Sofer = " + autobuzLinie2.getSofer());
    }
}

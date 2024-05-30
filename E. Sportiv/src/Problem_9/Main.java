package Problem_9;

public class Main {
    public static void main(String[] args) {
        SeatingComponent seat1 = new Seat("A1");
        SeatingComponent seat2 = new Seat("A2");
        SeatingComponent seat3 = new Seat("B1");
        SeatingComponent seat4 = new Seat("B2");

        Section tribunaNord = new Section("Tribuna Nord");
        tribunaNord.add(seat1);
        tribunaNord.add(seat2);

        Section tribunaSud = new Section("Tribuna Sud");
        tribunaSud.add(seat3);
        tribunaSud.add(seat4);

        Section tribuna = new Section("Tribuna");
        tribuna.add(tribunaNord);
        tribuna.add(tribunaSud);

        SeatingComponent peluza = new Section("Peluza");

        Section stadium = new Section("Stadium");
        stadium.add(tribuna);
        stadium.add(peluza);

        stadium.displaySeatInfo();
    }
}

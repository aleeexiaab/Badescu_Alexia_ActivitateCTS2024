package Problem_3;

public class Main {
    public static void main(String[] args) {
        Reservation reservation1 = new Reservation.Builder()
                .setFoodIncluded(true)
                .setErgonomicSeat(true)
                .setDrinkIncluded(true)
                .setPersonalizedMusic(true)
                .setMusicGenre("Jazz")
                .build();

        Reservation reservation2 = new Reservation.Builder()
                .setFoodIncluded(false)
                .setErgonomicSeat(true)
                .build();

        System.out.println(reservation1);
        System.out.println(reservation2);
    }
}

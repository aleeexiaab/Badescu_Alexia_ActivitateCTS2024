package Problem_9;

public class Main9 {
    public static void main(String[] args) {
        Reservation9 reservation = new ReservationProxy9();

        reservation.book(2);
        reservation.book(4);
        reservation.book(6);
    }
}

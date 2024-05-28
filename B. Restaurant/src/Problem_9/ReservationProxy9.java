package Problem_9;

public class ReservationProxy9 implements Reservation9 {
    private RealReservation9 realReservation;

    public ReservationProxy9() {
        this.realReservation = new RealReservation9();
    }

    @Override
    public void book(int numberOfPeople) {
        if (numberOfPeople >= 4) {
            realReservation.book(numberOfPeople);
        } else {
            System.out.println("Reservation denied. For less than 4 people, please come directly to the restaurant.");
        }
    }
}

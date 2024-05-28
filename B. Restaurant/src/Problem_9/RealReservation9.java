package Problem_9;

public class RealReservation9 implements Reservation9 {
    @Override
    public void book(int numberOfPeople) {
        System.out.println("Reservation successful for " + numberOfPeople + " people.");
    }
}

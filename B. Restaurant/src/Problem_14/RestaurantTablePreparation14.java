package Problem_14;

public class RestaurantTablePreparation14 extends TablePreparation14{
    @Override
    protected void cleanTable() {
        System.out.println("Cleaning the table.");
    }

    @Override
    protected void placeNapkins() {
        System.out.println("Placing napkins.");
    }

    @Override
    protected void placeCutlery() {
        System.out.println("Placing cutlery.");
    }

    @Override
    protected void inviteGuests() {
        System.out.println("Inviting guests to the table.");
    }
}

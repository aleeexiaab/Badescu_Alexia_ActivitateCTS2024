package Problem_6;

public class StadiumEntranceFacade {
    private IDVerification idVerification;
    private PoliceCheck policeCheck;
    private StadiumBanCheck stadiumBanCheck;

    public StadiumEntranceFacade() {
        idVerification = new IDVerification();
        policeCheck = new PoliceCheck();
        stadiumBanCheck = new StadiumBanCheck();
    }

    public boolean checkEntrance(String idSeries, String ticketCode) {
        if (!idVerification.verifyID(idSeries, ticketCode)) {
            System.out.println("ID verification failed.");
            return false;
        }
        if (policeCheck.isWantedByPolice(idSeries)) {
            System.out.println("Person is wanted by police.");
            return false;
        }
        if (stadiumBanCheck.hasStadiumBan(idSeries)) {
            System.out.println("Person has a stadium ban.");
            return false;
        }
        System.out.println("All checks passed. Entrance allowed.");
        return true;
    }
}

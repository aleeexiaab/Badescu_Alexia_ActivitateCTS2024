package Problem_6;

public class IDVerification {
    public boolean verifyID(String idSeries, String ticketCode) {
        return idSeries.equals("123456") && ticketCode.equals("TICKET123");
    }
}

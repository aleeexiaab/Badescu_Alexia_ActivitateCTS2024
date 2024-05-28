package Problem_14;

public abstract class TablePreparation14 {
    public final void prepareTable() {
        cleanTable();
        placeNapkins();
        placeCutlery();
        inviteGuests();
    }

    protected abstract void cleanTable();
    protected abstract void placeNapkins();
    protected abstract void placeCutlery();
    protected abstract void inviteGuests();
}

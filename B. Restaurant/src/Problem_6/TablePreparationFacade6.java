package Problem_6;

public class TablePreparationFacade6 {
    private TableAvailability6 tableAvailability;
    private TableCleanliness6 tableCleanliness;
    private TableNapkins6 tableNapkins;

    public TablePreparationFacade6() {
        this.tableAvailability = new TableAvailability6();
        this.tableCleanliness = new TableCleanliness6();
        this.tableNapkins = new TableNapkins6();
    }

    public boolean prepareTable(int tableNumber) {
        if (!tableAvailability.isTableAvailable(tableNumber)) {
            System.out.println("Table " + tableNumber + " is not available.\n");
            return false;
        }

        if (!tableCleanliness.isTableClean(tableNumber)) {
            System.out.println("Table " + tableNumber + " is not clean.\n");
            return false;
        }

        if (!tableNapkins.areNapkinsPlaced(tableNumber)) {
            System.out.println("Napkins are not placed at " + tableNumber + "\n");
            return false;
        }
        System.out.println("Table " + tableNumber + " is ready for the next customer.\n");
        return true;
    }
}

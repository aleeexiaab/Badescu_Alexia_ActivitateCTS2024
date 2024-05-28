package Problem_6;

public class Main6 {
    public static void main(String[] args) {
        TablePreparationFacade6 tablePreparationFacade = new TablePreparationFacade6();
        int tableNumber = 5;

        boolean isTableReady = tablePreparationFacade.prepareTable(tableNumber);

        if (isTableReady) {
            System.out.println("The table is ready for the customer.");
        } else {
            System.out.println("The table is not ready for the customer.");
        }
    }
}

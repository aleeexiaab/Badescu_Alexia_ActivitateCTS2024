package Problem_5;

public class Main {
    public static void main(String[] args) {
        SalesApplication salesApp = new SalesApplication();
        salesApp.setareMedicament("med123");
        System.out.println(salesApp.verificareDisponibilitate(50));

        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();
        InventoryAdapter adapter = new InventoryAdapter(inventorySystem);
        adapter.setareMedicament("med123");
        System.out.println(adapter.verificareDisponibilitate(50));
    }
}

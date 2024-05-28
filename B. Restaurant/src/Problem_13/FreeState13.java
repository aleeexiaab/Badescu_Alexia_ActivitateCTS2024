package Problem_13;

public class FreeState13 implements TableState13 {
    @Override
    public void reserve(Table13 table) {
        table.setState(new ReservedState13());
        System.out.println("Table is now reserved.");
    }

    @Override
    public void occupy(Table13 table) {
        table.setState(new OccupiedState13());
        System.out.println("Table is now occupied.");
    }

    @Override
    public void free(Table13 table) {
        System.out.println("Table is already free.");
    }
}

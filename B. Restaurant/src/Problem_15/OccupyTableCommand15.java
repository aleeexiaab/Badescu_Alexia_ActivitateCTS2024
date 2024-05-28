package Problem_15;

public class OccupyTableCommand15 implements Command15{
    private Table15 table;

    public OccupyTableCommand15(Table15 table) {
        this.table = table;
    }

    @Override
    public void execute() {
        table.occupy();
    }
}

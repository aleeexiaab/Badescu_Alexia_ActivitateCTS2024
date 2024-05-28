package Problem_15;

public class ReserveTableCommand15 implements Command15{
    private Table15 table;

    public ReserveTableCommand15(Table15 table) {
        this.table = table;
    }

    @Override
    public void execute() {
        table.reserve();
    }
}

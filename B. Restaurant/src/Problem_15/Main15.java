package Problem_15;

public class Main15 {
    public static void main(String[] args) {
        Table15 table1 = new Table15();
        Table15 table2 = new Table15();

        Command15 reserveTable1 = new ReserveTableCommand15(table1);
        Command15 occupyTable2 = new OccupyTableCommand15(table2);

        Operator15 operator = new Operator15();
        operator.takeCommand(reserveTable1);
        operator.takeCommand(occupyTable2);

        operator.executeCommands();
    }
}

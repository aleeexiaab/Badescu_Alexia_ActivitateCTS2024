package Problem_15;

import java.util.ArrayList;
import java.util.List;

public class Operator15 {
    private List<Command15> commands = new ArrayList<>();

    public void takeCommand(Command15 command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command15 command : commands) {
            command.execute();
        }
        commands.clear();
    }
}

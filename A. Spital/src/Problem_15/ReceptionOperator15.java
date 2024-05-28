package Problem_15;

import java.util.ArrayList;
import java.util.List;

public class ReceptionOperator15 {
    private List<Command15> commandQueue = new ArrayList<>();

    public void takeCommand(Command15 command) {
        commandQueue.add(command);
    }

    public void processCommands() {
        for (Command15 command : commandQueue) {
            command.execute();
        }
        commandQueue.clear();
    }
}

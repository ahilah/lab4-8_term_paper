package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;

public class ExitCommand implements MenuCommand {

    @Override
    public void execute() {
        System.out.println("\n\n\t Program is ended.");
        System.exit(0);
    }
}

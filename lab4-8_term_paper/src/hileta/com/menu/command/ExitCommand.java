package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;

public class ExitCommand implements MenuCommand {

    private String COMMAND_INFO = "exit";
    private static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void execute() {
        System.out.println(ANSI_PURPLE + "\n\n\t Program is ended." + ANSI_RESET);
        System.exit(0);
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

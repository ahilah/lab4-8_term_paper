package hileta.com.menu.main;

import hileta.com.menu.command.*;
import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

import java.util.*;

public class MainCommand {

    private List<MenuCommand> menuItems;
    private Network operatorNetwork;
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public MainCommand() {
        operatorNetwork = new Network();
        menuItems = new ArrayList<>();
        menuItems.add(new AddCommand(operatorNetwork));
        menuItems.add(new EditCommand(operatorNetwork));
        menuItems.add(new ViewCommand(operatorNetwork));
        menuItems.add(new SortCommand(operatorNetwork));
        menuItems.add(new DeleteCommand(operatorNetwork));
        menuItems.add(new ArchiveCommand(operatorNetwork));
        menuItems.add(new NumberCustomersCommand(operatorNetwork));
        menuItems.add(new ExitCommand());
    }


    public void execute(int numberOfCommand)  {
        // menuItems.getOrDefault(nameCommand, () -> System.out.println("Incorrect command! Try again.")).execute();
        try {
            menuItems.get(numberOfCommand).execute();
        }
        catch(Exception e) {
            System.out.println(ANSI_RED + "Incorrect command! Try again." + ANSI_RESET);
        }
    }

    public void showAvailableCommands() {
        for (int i = 0, j = i + 1; i < menuItems.size(); i++, j++) {
            System.out.println(j + " - " + menuItems.get(i).getCommandInfo());
        }
    }

}


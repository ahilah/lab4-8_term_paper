package hileta.com.menu.main;

import hileta.com.menu.command.*;
import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainCommand {
    private Map<String, MenuCommand> menuItems;

    private Network operatorNetwork = null;

    public MainCommand() {
        if(operatorNetwork == null) {
            operatorNetwork = new Network();
        }
        menuItems = new LinkedHashMap<>();
        menuItems.put("add", new Add(operatorNetwork));
        menuItems.put("edit", new EditCommand(operatorNetwork));
        menuItems.put("view", new ViewCommand(operatorNetwork));
        menuItems.put("sort", new SortCommand(operatorNetwork));
        menuItems.put("delete", new DeleteCommand(operatorNetwork));
        menuItems.put("archive", new ArchiveCommand(operatorNetwork));
        menuItems.put("exit", new ExitCommand());
    }


    public void execute(String nameCommand)  {
        menuItems.getOrDefault(nameCommand, () -> System.out.println("Incorrect command! Try again."))
                .execute();
        /* MenuCommand mainCommand = menuItems.get(nameCommand);
        if (mainCommand != null) {
            mainCommand.execute();
        } else {
            ;*/
    }

    public Set<String> getAvailableCommands() {
        return menuItems.keySet();
    }

}


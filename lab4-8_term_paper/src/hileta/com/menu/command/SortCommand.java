package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class SortCommand implements MenuCommand {
    private Network network;

    public SortCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("sort");
        network.sortTariffs();
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

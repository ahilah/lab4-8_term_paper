package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class DeleteCommand implements MenuCommand {
    private Network network;

    public DeleteCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("Delete.");
        network.deleteTariff();
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class FromFileCommand implements MenuCommand {
    private Network network;

    public FromFileCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("from file.");

    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

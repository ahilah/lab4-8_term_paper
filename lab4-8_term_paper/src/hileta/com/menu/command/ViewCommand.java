package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class ViewCommand implements MenuCommand {

    private String COMMAND_INFO = "view object";
    private Network network;

    public ViewCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("view");
        network.showAbroad();
        network.showTariffs();
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

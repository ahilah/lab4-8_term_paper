package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class EditCommand implements MenuCommand {

    private String COMMAND_INFO = "edit object";
    private Network network;

    public EditCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("edit");
        //network.getTariff();
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

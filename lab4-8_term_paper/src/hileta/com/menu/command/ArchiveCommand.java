package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class ArchiveCommand implements MenuCommand {

    private Network network;

    public ArchiveCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("archive");
        network.archiveTariff();
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import hileta.com.menu.main.MainCommand;
import network.Network;

public class Add implements MenuCommand {
    private Network network;

    public Add(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        System.out.println("add");
        network.addTariff();
        network.addAbroad();
        network.addCustomer();
        network.addNumber();
        new FromFileCommand(network).execute();
    }
}

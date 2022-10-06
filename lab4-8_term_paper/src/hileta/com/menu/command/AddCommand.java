package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

public class AddCommand implements MenuCommand {
    private Network network;

    public AddCommand(Network network) {
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

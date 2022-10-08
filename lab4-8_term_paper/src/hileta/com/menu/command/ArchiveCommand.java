package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

import java.util.Scanner;

public class ArchiveCommand implements MenuCommand {

    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private String COMMAND_INFO = "archive tariff";
    private Network network;

    public ArchiveCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        // System.out.println("archive");
        network.archiveTariff(network.getTariff(getNumberOfTariff()));
        System.out.println(ANSI_GREEN + "Tariff was successfully archived!" + ANSI_RESET);
    }

    private int getNumberOfTariff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t There are available commands: ");
        network.showTariffs();
        System.out.print("Type number of tariff here: ");
        int numberOfTariff = scanner.nextInt();
        return --numberOfTariff;
    }

    @Override
    public String getCommandInfo() {
        return COMMAND_INFO;
    }
}

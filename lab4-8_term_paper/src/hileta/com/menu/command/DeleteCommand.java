package hileta.com.menu.command;

import hileta.com.menu.command.commandable.MenuCommand;
import network.Network;

import java.util.Scanner;

public class DeleteCommand implements MenuCommand {

    private static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    private String COMMAND_INFO = "delete tariff";
    private Network network;

    public DeleteCommand(Network network) {
        this.network = network;
    }

    @Override
    public void execute() {
        // System.out.println("Delete.");
        network.deleteTariff(getNumberOfTariff());
        System.out.println(ANSI_GREEN + "Tariff was successfully deleted!" + ANSI_RESET);
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

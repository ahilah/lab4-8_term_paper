package hileta.com.menu.main;

import java.util.Locale;
import java.util.Scanner;

public class MainMenu {

    public Scanner scanner = new Scanner(System.in);
    public MainCommand mainCommand = new MainCommand();

    public void StartMainMenu() {
        while (true) {
            System.out.println("\nAvailable commands: " + mainCommand.getAvailableCommands());
            System.out.print("Enter your command here: ");
            String command = scanner.next().toLowerCase(Locale.ROOT);
            mainCommand.execute(command);
        }
    }
}

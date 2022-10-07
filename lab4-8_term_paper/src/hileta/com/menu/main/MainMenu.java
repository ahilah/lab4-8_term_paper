package hileta.com.menu.main;

import java.util.Scanner;

public class MainMenu {

    public Scanner scanner = new Scanner(System.in);
    public MainCommand mainCommand = new MainCommand();

    public void StartMainMenu() {
        while (true) {
            System.out.println("\nAvailable commands: ");
            mainCommand.showAvailableCommands();
            System.out.print("Enter your command here: ");
            int command = scanner.nextInt();
            mainCommand.execute(command);
        }
    }
}

package hileta.com.start;
import hileta.com.menu.main.MainCommand;
import hileta.com.menu.main.MainMenu;

import java.sql.*;

import java.io.IOException;

public class MainStart {
    public static void main(String[] args) throws InterruptedException, IOException, SQLException {
        System.out.println("HELLO WORLD");
        MainMenu mainMenu = new MainMenu();
        mainMenu.StartMainMenu();
    }
}
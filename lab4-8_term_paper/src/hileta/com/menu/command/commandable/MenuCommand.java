package hileta.com.menu.command.commandable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface MenuCommand {

    void execute(); //throws InterruptedException, IOException, SQLException;

    String getCommandInfo();
}

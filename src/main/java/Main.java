import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Main {
    public static void main(String[] args) {
        DBServiceWithLogging dbServiceWithLogging = new DBServiceWithLogging(new DBService(), (Logger) LogManager.getLogger(Main.class));
        dbServiceWithLogging.executeQuery("SELECT * FROM dummy");
    }
}

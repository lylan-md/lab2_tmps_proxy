import org.apache.logging.log4j.core.Logger;

public class DBServiceWithLogging {
    private Logger logger;
    private DBService dbService;

    public DBServiceWithLogging(DBService dbService, Logger logger) {
        this.logger = logger;
        this.dbService = dbService;
    }

    public boolean executeQuery(String query) {
        logger.debug("Execute query: " + query);
        return dbService.executeQuery(query);
    }
}

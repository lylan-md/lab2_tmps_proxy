public class DBService {
    private Object connect;

    public DBService() {
        this.connect();
    }

    public boolean executeQuery(String query) {
        // Some logic of query execution
        return true;
    }

    private void connect() {
        // Logic of connection
        this.connect = new Object();
    }
}

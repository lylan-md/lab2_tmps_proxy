public class DBService implements DBServiceInterface {
    private Object connect;

    public DBService() {
        this.connect();
    }

    @Override
    public boolean executeQuery(String query) {
        // Some logic of query execution
        return true;
    }

    private void connect() {
        // Logic of connection
        this.connect = new Object();
    }
}

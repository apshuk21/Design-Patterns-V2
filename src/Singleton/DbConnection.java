package Singleton;

// Single threaded lazy initialization
public class DbConnection {
    private static DbConnection instance;

    // other useful instance variables here

    private DbConnection() {}

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return DbConnection.instance;
    }

    // other useful methods here
}

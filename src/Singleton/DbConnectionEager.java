package Singleton;

// This is a thread safe singleton with eager initialisation.

/**
 * Eager initialisation happens during the class load time and in the main thread
 * So, when multiple threads hit the getInstance method, we already have the instance available.
 * Drawbacks:
 * Increases the application start time.
 * If not used, memory waste
 */
public class DbConnectionEager {
    private static DbConnectionEager instance;

    static {
        try {
            instance = new DbConnectionEager();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private DbConnectionEager() {}

    public static DbConnectionEager getInstance() {
        return instance;
    }
}

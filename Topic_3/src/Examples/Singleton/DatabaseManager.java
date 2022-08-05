package Examples.Singleton;

/**
 *  Some Singletons can be accessed by multiple threads.
 *  This Singleton has lazy initialization and it's thread-safe
 */
public class DatabaseManager {
    private static DatabaseManager instance;
    private static boolean toInitialize = true;

    private DatabaseManager() {
    }

    public static DatabaseManager getInstance() {
        if (toInitialize) {
            synchronized (DatabaseManager.class) {
                if (toInitialize) {
                    instance = new DatabaseManager();
                    toInitialize = false;
                }
            }
        }
        return instance;
    }
}

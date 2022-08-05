package Examples.Singleton;

/**
 *  This Singleton has lazy initialization: It only creates an instance when getInstance() gets called first
 */
public class LazyGame {
    private static volatile LazyGame INSTANCE = null;

    private LazyGame() {}

    public static LazyGame getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyGame();
        }

        return INSTANCE;
    }

    public void start() {
        System.out.println("Starting game...");
    }
}

package Examples.Singleton;

public class Game {
    private static final Game INSTANCE = new Game();

    private Game() {}

    public static Game getInstance() {
        return INSTANCE;
    }

    public void start() {
        System.out.println("Starting game...");
    }
}

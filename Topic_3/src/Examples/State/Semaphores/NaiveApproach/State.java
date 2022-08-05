package Examples.State.Semaphores.NaiveApproach;

public enum State {
    RED("Red", "Red"),
    YELLOW("Yellow", "Yellow"),
    GREEN("Green", "Green"),
    PANIC("Panic", "Red"),
    BLINKING("Blinking", "Blinking Yellow")
    ;

    // Private attributes

    private final String name;
    private final String color;

    State(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

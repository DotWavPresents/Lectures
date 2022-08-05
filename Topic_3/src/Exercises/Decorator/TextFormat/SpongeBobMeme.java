package Exercises.Decorator.TextFormat;

public class SpongeBobMeme extends FormatDecorator {
    public SpongeBobMeme(TextFormatter item) {
        super(item);
    }

    /**
     *  Renders the given String such that it appears as we're mocking it.
     * Ex: "Hello there!" -> "HeLlO ThErE!"
     *  Note: The output doesn't need to look exactly like this. The only requirement
     * is that the characters toggle between UPPER CASE and lower case if they're adjacent
     * @param text
     *  The given String
     * @return
     *  The formatted String
     */
    @Override
    public String render(String text) {
        // TODO
        return "";
    }
}

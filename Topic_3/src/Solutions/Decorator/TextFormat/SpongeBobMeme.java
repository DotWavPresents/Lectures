package Solutions.Decorator.TextFormat;

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
        StringBuilder memed = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            memed.append(i % 2 == 0 ? Character.toLowerCase(text.charAt(i)) : Character.toUpperCase(text.charAt(i)));
        }

        return super.render(memed.toString());
    }
}

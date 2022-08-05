package Exercises.Decorator.TextFormat;

public class Underline extends FormatDecorator {
    public Underline(TextFormatter item) {
        super(item);
    }

    /**
     *  Renders the given String between <u> </u>
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

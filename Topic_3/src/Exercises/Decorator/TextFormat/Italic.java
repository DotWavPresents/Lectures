package Exercises.Decorator.TextFormat;

public class Italic extends FormatDecorator {
    public Italic(TextFormatter item) {
        super(item);
    }

    /**
     *  Renders the given String between <i> </i>
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

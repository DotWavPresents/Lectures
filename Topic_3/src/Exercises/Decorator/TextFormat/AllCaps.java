package Exercises.Decorator.TextFormat;

public class AllCaps extends FormatDecorator {
    public AllCaps(TextFormatter item) {
        super(item);
    }

    /**
     *  Renders the given String as being all in UPPER CASE
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

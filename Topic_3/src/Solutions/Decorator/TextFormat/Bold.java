package Solutions.Decorator.TextFormat;

public class Bold extends FormatDecorator {
    public Bold(TextFormatter item) {
        super(item);
    }

    /**
     *  Renders the given String between <b> </b>
     * @param text
     *  The given String
     * @return
     *  The formatted String
     */
    @Override
    public String render(String text) {
        return "<b>" + super.render(text) + "</b>";
    }
}

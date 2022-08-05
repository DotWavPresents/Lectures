package Solutions.Decorator.TextFormat;

/**
 *  This is the Decorator for TextItem
 */
public abstract class FormatDecorator implements TextFormatter {

    private final TextFormatter item;

    public FormatDecorator(TextFormatter item) {
        this.item = item;
    }

    public TextFormatter getItem() {
        return item;
    }

    @Override
    public String render(String text) {
        return item.render(text);
    }
}

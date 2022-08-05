package Solutions.Decorator.TextFormat;

/**
 *  Concrete Component
 */
public class SimpleFormatter implements TextFormatter {

    @Override
    public String render(String text) {
        return text;
    }
}

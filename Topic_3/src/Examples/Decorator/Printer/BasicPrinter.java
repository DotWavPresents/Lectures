package Examples.Decorator.Printer;

public class BasicPrinter implements Printer {

    private String text;

    public BasicPrinter(String text) {
        this.text = text;
    }

    @Override
    public String print() {
        return text;
    }
}

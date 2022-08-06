package Examples.Decorator.Printer.NonEmpty;

public class ColoredPrinter implements Printer {

    private Printer printer;
    private String color;

    public ColoredPrinter(String color, Printer printer) {
        this.printer = printer;
        this.color = color;
    }

    @Override
    public String print() {
        return "<" + color + ">" + printer.print() + "</" + color + ">";
    }
}

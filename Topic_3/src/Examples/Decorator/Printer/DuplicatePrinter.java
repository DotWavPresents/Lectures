package Examples.Decorator.Printer;

public class DuplicatePrinter implements Printer {

    private Printer printer;

    public DuplicatePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        return printer.print() + " " + printer.print();
    }
}

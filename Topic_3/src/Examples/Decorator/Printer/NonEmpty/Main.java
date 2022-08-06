package Examples.Decorator.Printer.NonEmpty;
public class Main {

    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter("Hello there!");
        Printer coloredPrinter = new ColoredPrinter("red", new BasicPrinter("General Kenobi!"));
        Printer duplicatePrinter = new DuplicatePrinter(new BasicPrinter("Ohh no!"));
        Printer coloredDuplicatedPrinter = new ColoredPrinter("green", new DuplicatePrinter(new BasicPrinter("pLs Doigjhfkdl")));
        Printer whatAMess = new ColoredPrinter("yellow", new ColoredPrinter("blue", new DuplicatePrinter(new BasicPrinter("AAAAAHHHH"))));
        Printer aaaaahahhahhaHEEEELP = new DuplicatePrinter(
                new ColoredPrinter("pain",
                        new DuplicatePrinter(
                                new ColoredPrinter("void",
                                        new BasicPrinter("JUICE; FIG; DO SOMETHING"))
                        ))
        );
        Printer pain = new DuplicatePrinter(aaaaahahhahhaHEEEELP);

        System.out.println("Basic printer: " + basicPrinter.print());
        System.out.println("Colored printer: " + coloredPrinter.print());
        System.out.println("Duplicate printer: " + duplicatePrinter.print());
        System.out.println("Basic printer: " + coloredDuplicatedPrinter.print());
        System.out.println("Basic printer: " + whatAMess.print());
        System.out.println("Basic printer: " + aaaaahahhahhaHEEEELP.print());
        System.out.println("Basic printer: " + pain.print());
    }
}

package Examples.Composite.TaxPayer.CompositeApproach;

public class Main {

    public static void main(String[] args) {
        Person jordan = new Person(10000);
        Person blackKnight = new Person(500);
        Person vimHax = new Person(5700);
        Person aylias = new Person(300);
        Person yoursole = new Person(200);

        Company dotWav = new Company(jordan, blackKnight);
        Company mcDonalds = new Company(aylias, yoursole);

        City lisbon = new City(dotWav, mcDonalds, vimHax);

        TaxCollector government = new TaxCollector();

        // ---Composite approach---

        // Calculating the tax that individuals need to pay

        System.out.println("Jordan's taxes: " + government.collectTaxes(jordan));
        System.out.println("Knight's taxes: " + government.collectTaxes(blackKnight));
        System.out.println("Vim's taxes: " + government.collectTaxes(vimHax));
        System.out.println("Aylias's taxes: " + government.collectTaxes(aylias));
        System.out.println("Yoursole's taxes: " + government.collectTaxes(yoursole));

        // Calculating the tax that the companies need to pay

        System.out.println("DotWav's total taxes: " + government.collectTaxes(dotWav));
        System.out.println("McDonalds's total taxes: " + government.collectTaxes(mcDonalds));

        // Calculating the tax that the city needs to pay
        System.out.println("Lisbon's total taxes: " + government.collectTaxes(lisbon));
    }
}

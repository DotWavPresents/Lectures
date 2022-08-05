package Examples.Composite.TaxPayer.NaiveApproach;

/**
 *  Composite Tax Payer
 */
public class City {

    private final Company[] companies;
    private final Person[] individualWorkers;

    public City(Company[] companies, Person[] individualWorkers) {
        this.companies = companies;
        this.individualWorkers = individualWorkers;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public Person[] getIndividualWorkers() {
        return individualWorkers;
    }
}

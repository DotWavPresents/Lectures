package Examples.Composite.TaxPayer.NaiveApproach;

public class TaxCollector {

    public int collectTaxes(Person person) {
        return person.getAmountToPay();
    }

    public int collectTaxes(Company company) {
        int amount = 0;

        for(Person employee : company.getEmployees()) {
            amount += employee.getAmountToPay();
        }

        return amount;
    }

    public int collectTaxes(City city) {
        int amount = 0;

        for(Person individualWorker : city.getIndividualWorkers()) {
            amount += individualWorker.getAmountToPay();
        }

        for(Company company : city.getCompanies()) {
            amount += collectTaxes(company);
        }

        return amount;
    }
}

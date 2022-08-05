package Examples.Composite.TaxPayer.CompositeApproach;

public class CompositeTaxPayer implements TaxPayer {

    private final TaxPayer[] taxPayers;

    public CompositeTaxPayer(TaxPayer... taxPayers) {
        this.taxPayers = taxPayers;
    }

    @Override
    public int getAmountToPay() {
        int amount = 0;

        for(TaxPayer taxPayer : taxPayers) {
            amount += taxPayer.getAmountToPay();
        }

        return amount;
    }
}

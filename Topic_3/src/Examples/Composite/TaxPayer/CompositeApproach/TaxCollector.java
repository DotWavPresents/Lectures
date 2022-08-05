package Examples.Composite.TaxPayer.CompositeApproach;

public class TaxCollector {

    public int collectTaxes(TaxPayer taxPayer) {
        return taxPayer.getAmountToPay();
    }
}

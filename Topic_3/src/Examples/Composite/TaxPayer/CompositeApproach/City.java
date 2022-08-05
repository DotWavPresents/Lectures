package Examples.Composite.TaxPayer.CompositeApproach;

/**
 *  Composite Tax Payer
 */
public class City extends CompositeTaxPayer {

    public City(TaxPayer... taxPayers) {
        super(taxPayers);
    }
}

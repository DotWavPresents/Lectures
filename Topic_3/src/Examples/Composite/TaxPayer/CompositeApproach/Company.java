package Examples.Composite.TaxPayer.CompositeApproach;

/**
 *  Composite tax payer
 */
public class Company extends CompositeTaxPayer {

    public Company(Person... employees) {
        super(employees);
    }
}

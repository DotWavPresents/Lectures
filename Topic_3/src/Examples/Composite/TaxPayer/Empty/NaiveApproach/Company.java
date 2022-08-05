package Examples.Composite.TaxPayer.Empty.NaiveApproach;

/**
 *  Composite tax payer
 */
public class Company {

    private final Person[] employees;

    public Company(Person... employees) {
        this.employees = employees;
    }

    public Person[] getEmployees() {
        return employees;
    }
}

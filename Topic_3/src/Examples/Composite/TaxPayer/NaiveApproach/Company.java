package Examples.Composite.TaxPayer.NaiveApproach;

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

package Examples.Composite.TaxPayer.CompositeApproach;

public class Person implements TaxPayer {

    private final int monthlySalary;

    public Person(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public int getAmountToPay() {
        return (int) (monthlySalary * 0.2);
    }
}

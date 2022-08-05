package Examples.Composite.TaxPayer.Empty.NaiveApproach;

public class Person {

    private final int monthlySalary;

    public Person(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getAmountToPay() {
        return (int) (monthlySalary * 0.2);
    }
}

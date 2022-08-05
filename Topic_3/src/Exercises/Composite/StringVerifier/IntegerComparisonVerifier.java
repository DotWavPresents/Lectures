package Exercises.Composite.StringVerifier;

/**
 *  Leaf verifier
 */
public abstract class IntegerComparisonVerifier implements Verifier {

    private final int amount;

    public IntegerComparisonVerifier(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

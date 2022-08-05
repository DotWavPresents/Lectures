package Solutions.Composite.StringVerifier;

public class LengthLesserThan extends IntegerComparisonVerifier {

    public LengthLesserThan(int amount) {
        super(amount);
    }

    @Override
    public boolean ok(String string) {
        return string.length() < getAmount();
    }
}

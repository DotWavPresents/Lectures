package Solutions.Composite.StringVerifier;

public class LengthGreaterThan extends IntegerComparisonVerifier {

    public LengthGreaterThan(int amount) {
        super(amount);
    }

    @Override
    public boolean ok(String string) {
        return string.length() > getAmount();
    }
}

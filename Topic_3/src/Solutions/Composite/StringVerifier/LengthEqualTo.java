package Solutions.Composite.StringVerifier;

public class LengthEqualTo extends IntegerComparisonVerifier {

    public LengthEqualTo(int amount) {
        super(amount);
    }

    @Override
    public boolean ok(String string) {
        return string.length() == getAmount();
    }
}

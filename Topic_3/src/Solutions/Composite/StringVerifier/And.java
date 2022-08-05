package Solutions.Composite.StringVerifier;

/**
 *  Composite verifier
 */
public class And extends BinaryOperator {
    public And(Verifier left, Verifier right) {
        super(left, right);
    }

    @Override
    public boolean ok(String string) {
        return left.ok(string) && right.ok(string);
    }
}

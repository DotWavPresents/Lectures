package Solutions.Composite.StringVerifier;

/**
 *  Composite verifier
 */
public class Not extends UnaryOperator {

    public Not(Verifier verifier) {
        super(verifier);
    }

    @Override
    public boolean ok(String string) {
        return !verifier.ok(string);
    }
}

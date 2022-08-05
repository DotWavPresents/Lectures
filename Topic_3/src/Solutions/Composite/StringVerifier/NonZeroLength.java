package Solutions.Composite.StringVerifier;

/**
 *  Leaf verifier
 */
public class NonZeroLength implements Verifier{
    @Override
    public boolean ok(String string) {
        return string.length() != 0;
    }
}

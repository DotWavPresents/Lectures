package Solutions.Composite.StringVerifier;

/**
 *  Leaf verifier
 */
public class LengthIsEven implements Verifier{
    @Override
    public boolean ok(String string) {
        return string.length() % 2 == 0;
    }
}

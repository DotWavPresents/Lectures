package Solutions.Composite.StringVerifier;

public abstract class BinaryOperator implements Verifier {

    protected final Verifier left;
    protected final Verifier right;

    public BinaryOperator(Verifier left, Verifier right) {
        this.left = left;
        this.right = right;
    }
}

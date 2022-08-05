package Exercises.Composite.StringVerifier;

public abstract class UnaryOperator implements Verifier {

    protected final Verifier verifier;

    public UnaryOperator(Verifier verifier) {
        this.verifier = verifier;
    }
}

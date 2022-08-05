package Solutions.Composite.StringVerifier;

public abstract class AllOperator implements Verifier {

    protected final Verifier[] verifiers;

    public AllOperator(Verifier... verifiers) {
        if(verifiers.length < 1) {
            throw new IllegalArgumentException("Must have at least 1 verifier.");
        }

        this.verifiers = verifiers;
    }
}

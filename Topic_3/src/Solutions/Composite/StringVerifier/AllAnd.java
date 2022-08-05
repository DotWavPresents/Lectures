package Solutions.Composite.StringVerifier;

/**
 *  Composite verifier
 */
public class AllAnd extends AllOperator {

    public AllAnd(Verifier... verifiers) {
        super(verifiers);
    }

    @Override
    public boolean ok(String string) {
        boolean veredict = verifiers[0].ok(string);

        for(int i = 1; i < verifiers.length; i++) {
            veredict = veredict && verifiers[1].ok(string);
        }

        return veredict;
    }
}

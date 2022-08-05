package Exercises.Composite.StringVerifier;

public interface Verifier {

    /**
     *  Checks if the given string is valid according to some criteria
     * @param string
     *  The given string
     * @return
     *  True if it passes the criteria
     */
    boolean ok(String string);
}

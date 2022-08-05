package Solutions.Composite.StringVerifier;

public class Main {

    public static void main(String[] args) {
        String s1 = "potato";
        String s2 = "oo";
        String s3 = "xyz";

        // Verifies if a String's length is even and is > 4
        Verifier v1 = new And(new LengthIsEven(), new LengthGreaterThan(4));

        // Verifies if a String's length is (greater than 5 and lesser than 8) or if it's equal to 2
        Verifier v2 = new Or(
                new And(new LengthGreaterThan(5), new LengthLesserThan(8)),
                new LengthEqualTo(2));

        // Verifies if a String's length is not odd and not greater than 2 and not lesser than 6
        Verifier v3 = new Not(
                new AllAnd(
                        new LengthIsOdd(),
                        new LengthGreaterThan(2),
                        new LengthLesserThan(6)));

        // Verifies if a String starts with 'p' and contains at least 1 'o'
        Verifier v4 = new And(string -> string.charAt(0) == 'p', string -> string.contains("o"));

        System.out.println("1: " + v1.ok(s1)); // true
        System.out.println("2: " + v1.ok(s2)); // false
        System.out.println("3: " + v1.ok(s3)); // false
        System.out.println("4: " + v2.ok(s1)); // true
        System.out.println("5: " + v2.ok(s2)); // true
        System.out.println("6: " + v2.ok(s3)); // false
        System.out.println("7: " + v3.ok(s1)); // true
        System.out.println("8: " + v3.ok(s2)); // true
        System.out.println("9: " + v3.ok(s3)); // false
        System.out.println("10: " + v4.ok(s1)); // true
        System.out.println("11: " + v4.ok(s2)); // false
        System.out.println("12: " + v4.ok(s3)); // false
    }
}

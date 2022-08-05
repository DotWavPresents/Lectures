package Examples.Visitor.Farm;

public class Farm {
    public Vegetable harvest() {
        // Using a simple Factory Design Pattern to generate random veggies
        return switch ((int) (Math.random() * 3)) {
            case 0 -> new Lettuce();
            case 1 -> new Potato();
            case 2 -> new Onion();
            default -> throw new IllegalStateException("Unexpected value: " + (int) (Math.random() * 3));
        };
    }
}

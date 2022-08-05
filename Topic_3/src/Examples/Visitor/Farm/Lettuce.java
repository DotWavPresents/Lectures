package Examples.Visitor.Farm;

public class Lettuce implements Vegetable {
    @Override
    public int nutritiousValue() {
        return 5;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package Examples.Visitor.Farm;

public class Potato implements Vegetable {
    @Override
    public int nutritiousValue() {
        return 25;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

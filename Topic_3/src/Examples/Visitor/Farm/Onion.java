package Examples.Visitor.Farm;

public class Onion implements Vegetable {
    @Override
    public int nutritiousValue() {
        return 15;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

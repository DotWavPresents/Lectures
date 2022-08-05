package Examples.Visitor.Farm;

public interface Vegetable {
    int nutritiousValue();

    void accept(Visitor visitor);
}

package Examples.Visitor.Farm;

public interface Visitor {
    void visit(Lettuce lettuce);
    void visit(Potato potato);
    void visit(Onion onion);
}

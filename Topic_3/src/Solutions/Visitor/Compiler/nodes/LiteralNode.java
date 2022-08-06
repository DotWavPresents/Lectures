package Solutions.Visitor.Compiler.nodes;

public abstract class LiteralNode<T> extends ValueNode {

    private final T literal;

    public LiteralNode(T literal) {
        this.literal = literal;
    }

    public T getLiteral() {
        return literal;
    }
}

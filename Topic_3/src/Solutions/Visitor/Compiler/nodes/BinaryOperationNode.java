package Solutions.Visitor.Compiler.nodes;

public abstract class BinaryOperationNode extends ValueNode {

    private final ValueNode left;
    private final ValueNode right;

    public BinaryOperationNode(ValueNode left, ValueNode right) {
        this.left = left;
        this.right = right;
    }

    public ValueNode getLeft() {
        return left;
    }

    public ValueNode getRight() {
        return right;
    }
}

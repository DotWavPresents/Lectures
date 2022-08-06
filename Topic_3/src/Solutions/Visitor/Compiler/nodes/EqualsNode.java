package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public class EqualsNode extends BinaryOperationNode {

    public EqualsNode(ValueNode left, ValueNode right) {
        super(left, right);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

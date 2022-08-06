package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public class LesserThanNode extends BinaryOperationNode {

    public LesserThanNode(ValueNode left, ValueNode right) {
        super(left, right);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

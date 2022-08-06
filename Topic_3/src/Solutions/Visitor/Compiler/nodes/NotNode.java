package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public class NotNode extends ValueNode {

    private final ValueNode valueNode;

    public NotNode(ValueNode valueNode) {
        this.valueNode = valueNode;
    }

    public ValueNode getValueNode() {
        return valueNode;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

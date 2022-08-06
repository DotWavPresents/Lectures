package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public class IfNode extends Node {

    private final ValueNode valueNode;
    private final Node[] body;

    public IfNode(ValueNode valueNode, Node... body) {
        this.valueNode = valueNode;
        this.body = body;
    }

    public ValueNode getValueNode() {
        return valueNode;
    }

    public Node[] getBody() {
        return body;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

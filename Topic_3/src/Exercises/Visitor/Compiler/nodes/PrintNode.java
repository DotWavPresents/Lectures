package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class PrintNode extends Node {

    private final ValueNode valueNode;

    public PrintNode(ValueNode valueNode) {
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

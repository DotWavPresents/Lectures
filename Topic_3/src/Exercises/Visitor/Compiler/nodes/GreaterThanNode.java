package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class GreaterThanNode extends BinaryOperationNode {

    public GreaterThanNode(ValueNode left, ValueNode right) {
        super(left, right);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

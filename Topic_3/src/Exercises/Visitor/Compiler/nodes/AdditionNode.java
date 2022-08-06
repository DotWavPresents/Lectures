package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class AdditionNode extends BinaryOperationNode {

    public AdditionNode(ValueNode left, ValueNode right) {
        super(left, right);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

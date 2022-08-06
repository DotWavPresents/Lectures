package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class StringNode extends LiteralNode<String> {

    public StringNode(String literal) {
        super(literal);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

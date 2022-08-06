package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class VariableNode extends ValueNode {

    private final String name;

    public VariableNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

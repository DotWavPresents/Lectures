package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class VariableAssignementNode extends Node {

    private final VariableNode variableNode;
    private final ValueNode assignementNode;

    public VariableAssignementNode(VariableNode variableNode, ValueNode assignementNode) {
        this.variableNode = variableNode;
        this.assignementNode = assignementNode;
    }

    public VariableNode getVariableNode() {
        return variableNode;
    }

    public ValueNode getAssignementNode() {
        return assignementNode;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

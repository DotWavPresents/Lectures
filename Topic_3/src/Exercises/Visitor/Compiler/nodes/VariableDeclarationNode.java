package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public class VariableDeclarationNode extends Node {

    private final VariableNode variableNode;
    private final ValueNode initializationNode;

    public VariableDeclarationNode(VariableNode variableNode, ValueNode initializationNode) {
        this.variableNode = variableNode;
        this.initializationNode = initializationNode;
    }

    public VariableDeclarationNode(VariableNode variableNode) {
        this(variableNode, null);
    }

    public VariableNode getVariableNode() {
        return variableNode;
    }

    /**
     *  May be null (some variables can be declared without an initial value)
     * @return
     *  The ValueNode with which this node's variable is being initialized with
     */
    public ValueNode getInitializationNode() {
        return initializationNode;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

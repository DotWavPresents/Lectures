package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public class MainNode extends Node {

    private final Node[] nodes;

    public MainNode(Node... nodes) {
        this.nodes = nodes;
    }

    public Node[] getNodes() {
        return nodes;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public class IntegerNode extends LiteralNode<Integer> {

    public IntegerNode(Integer literal) {
        super(literal);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

package Solutions.Visitor.Compiler.nodes;

import Solutions.Visitor.Compiler.visitors.Visitor;

public abstract class Node {

    public abstract String accept(Visitor visitor);
}

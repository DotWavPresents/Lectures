package Exercises.Visitor.Compiler.nodes;

import Exercises.Visitor.Compiler.visitors.Visitor;

public abstract class Node {

    public abstract String accept(Visitor visitor);
}

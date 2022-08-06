package Exercises.Visitor.Compiler.visitors;

import Exercises.Visitor.Compiler.nodes.*;

public interface Visitor {
    String visit(AdditionNode node);
    String visit(EqualsNode node);
    String visit(GreaterThanNode node);
    String visit(IfNode node);
    String visit(IntegerNode node);
    String visit(LesserThanNode node);
    String visit(MainNode node);
    String visit(NotNode node);
    String visit(PrintNode node);
    String visit(StringNode node);
    String visit(VariableAssignementNode node);
    String visit(VariableDeclarationNode node);
    String visit(VariableNode node);
}

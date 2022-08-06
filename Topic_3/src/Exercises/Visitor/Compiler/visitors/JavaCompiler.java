package Exercises.Visitor.Compiler.visitors;

import Exercises.Visitor.Compiler.nodes.*;

public class JavaCompiler implements Visitor {

    private int tabDepth = 0;

    private StringBuilder appendTabs(StringBuilder builder) {
        for(int i = 0; i < tabDepth; i++) {
            builder.append('\t');
        }

        return builder;
    }

    @Override
    public String visit(AdditionNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(EqualsNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(GreaterThanNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(IfNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(IntegerNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(LesserThanNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(MainNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(NotNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(PrintNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(StringNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(VariableAssignementNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(VariableDeclarationNode node) {
        // TODO
        return "";
    }

    @Override
    public String visit(VariableNode node) {
        // TODO
        return "";
    }
}

package Exercises.Visitor.Compiler.visitors;

import Exercises.Visitor.Compiler.nodes.*;

public class BritishCompiler implements Visitor {

    private int tabDepth = 0;

    private StringBuilder appendTabs(StringBuilder builder) {
        for(int i = 0; i < tabDepth; i++) {
            builder.append('\t');
        }

        return builder;
    }

    @Override
    public String visit(AdditionNode node) {
        return "the addition of " + node.getLeft().accept(this) + " with " + node.getRight().accept(this);
    }

    @Override
    public String visit(EqualsNode node) {
        return "Is " + node.getLeft().accept(this) + " equal to " + node.getRight().accept(this) + "?";
    }

    @Override
    public String visit(GreaterThanNode node) {
        return "Is " + node.getLeft().accept(this) + " greater than " + node.getRight().accept(this) + "?";
    }

    @Override
    public String visit(IfNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Now, ask the following question: ")
                .append(node.getValueNode().accept(this))
                .append(" If so, follow these steps, mate:\n");

        tabDepth++;

        for(Node bodyNode : node.getBody()) {
            appendTabs(builder).append('-').append(bodyNode.accept(this));
        }

        tabDepth--;

        return builder.toString();
    }

    @Override
    public String visit(IntegerNode node) {
        return "the numbah " + node.getLiteral();
    }

    @Override
    public String visit(LesserThanNode node) {
        return "Is " + node.getLeft().accept(this) + " less than " + node.getRight().accept(this) + "?";
    }

    @Override
    public String visit(MainNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Howdy my good Sir! I need you to do a few things for me:\n");

        tabDepth++;

        int i = 0;

        for(Node bodyNode : node.getNodes()) {
            appendTabs(builder).append(i).append(") ").append(bodyNode.accept(this));
            i++;
        }

        tabDepth--;

        builder.append("Now that we are done, piss off, ya wanker!\n");

        return builder.toString();
    }

    @Override
    public String visit(NotNode node) {
        return node.getValueNode().accept(this) + " Quite the contrary!";
    }

    @Override
    public String visit(PrintNode node) {
        return "Pick up your monocle and write this on paper: " + node.getValueNode().accept(this) + "\n";
    }

    @Override
    public String visit(StringNode node) {
        return "the text '" + node.getLiteral() + "'";
    }

    @Override
    public String visit(VariableAssignementNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Now assume that we replace the ")
                .append(node.getVariableNode().accept(this))
                .append(" teacup's content with ")
                .append(node.getAssignementNode().accept(this))
                .append(".\n");

        return builder.toString();
    }

    @Override
    public String visit(VariableDeclarationNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Assume you have a cup of tea called ")
                .append(node.getVariableNode().accept(this));

        if(node.getInitializationNode() == null) {
            builder.append(" with nothing inside.\n");
        }
        else {
            builder.append(" with ")
                    .append(node.getInitializationNode().accept(this))
                    .append(" inside of it.\n");
        }

        return builder.toString();
    }

    @Override
    public String visit(VariableNode node) {
        return "'" + node.getName() + "'";
    }
}

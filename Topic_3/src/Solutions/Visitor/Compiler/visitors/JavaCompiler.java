package Solutions.Visitor.Compiler.visitors;

import Solutions.Visitor.Compiler.nodes.*;

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
        return "(" + node.getLeft().accept(this) + " + " + node.getRight().accept(this) + ")";
    }

    @Override
    public String visit(EqualsNode node) {
        return "(" + node.getLeft().accept(this) + " == " + node.getRight().accept(this) + ")";
    }

    @Override
    public String visit(GreaterThanNode node) {
        return "(" + node.getLeft().accept(this) + " > " + node.getRight().accept(this) + ")";
    }

    @Override
    public String visit(IfNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("if(")
                .append(node.getValueNode().accept(this))
                .append(") {\n");

        tabDepth++;

        for(Node bodyNode : node.getBody()) {
            appendTabs(builder).append(bodyNode.accept(this));
        }

        tabDepth--;

        appendTabs(builder).append("}\n");

        return builder.toString();
    }

    @Override
    public String visit(IntegerNode node) {
        return "" + node.getLiteral();
    }

    @Override
    public String visit(LesserThanNode node) {
        return "(" + node.getLeft().accept(this) + " < " + node.getRight().accept(this) + ")";
    }

    @Override
    public String visit(MainNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("public static void main(String[] args) {\n");

        tabDepth++;

        for(Node bodyNode : node.getNodes()) {
            appendTabs(builder).append(bodyNode.accept(this));
        }

        tabDepth--;

        appendTabs(builder).append("}\n");

        return builder.toString();
    }

    @Override
    public String visit(NotNode node) {
        return "!(" + node.getValueNode().accept(this) + ")";
    }

    @Override
    public String visit(PrintNode node) {
        return "System.out.println(" + node.getValueNode().accept(this) + ");\n";
    }

    @Override
    public String visit(StringNode node) {
        return '"' + node.getLiteral() + '"';
    }

    @Override
    public String visit(VariableAssignementNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append(node.getVariableNode().accept(this))
                .append(" = ")
                .append(node.getAssignementNode().accept(this))
                .append(";\n");

        return builder.toString();
    }

    @Override
    public String visit(VariableDeclarationNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Object ").append(node.getVariableNode().accept(this));

        if(node.getInitializationNode() == null) {
            builder.append(";\n");
        }
        else {
            builder.append(" = ").append(node.getInitializationNode().accept(this)).append(";\n");
        }

        return builder.toString();
    }

    @Override
    public String visit(VariableNode node) {
        return node.getName();
    }
}

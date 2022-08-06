package Solutions.Visitor.Compiler.visitors;

import Solutions.Visitor.Compiler.nodes.*;

public class RandomLanguageCompiler implements Visitor {

    private int tabDepth = 0;

    private StringBuilder appendTabs(StringBuilder builder) {
        for(int i = 0; i < tabDepth; i++) {
            builder.append('\t');
        }

        return builder;
    }

    @Override
    public String visit(AdditionNode node) {
        return "a adição de " + node.getLeft().accept(this) + " com " + node.getRight().accept(this);
    }

    @Override
    public String visit(EqualsNode node) {
        return node.getLeft().accept(this) + " é igual a " + node.getRight().accept(this) + "?";
    }

    @Override
    public String visit(GreaterThanNode node) {
        return node.getLeft().accept(this) + " é maior do que " + node.getRight().accept(this) + "?";
    }

    @Override
    public String visit(IfNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Tenho uma pergunta: ")
                .append(node.getValueNode().accept(this))
                .append(" Se for falso, vai-te foder. Se for verdadeiro, faz o seguinte:\n");

        tabDepth++;

        for(Node bodyNode : node.getBody()) {
            appendTabs(builder).append('-').append(bodyNode.accept(this));
        }

        tabDepth--;

        return builder.toString();
    }

    @Override
    public String visit(IntegerNode node) {
        return "o número " + node.getLiteral();
    }

    @Override
    public String visit(LesserThanNode node) {
        return node.getLeft().accept(this) + " é menor do que " + node.getRight().accept(this) + "?";
    }

    @Override
    public String visit(MainNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Então, pá? Há quanto tempo, seu filho da mãe! Olha, podias-me fazer estes favores?:\n");

        tabDepth++;

        int i = 0;

        for(Node bodyNode : node.getNodes()) {
            appendTabs(builder).append(i).append(") ").append(bodyNode.accept(this));
            i++;
        }

        tabDepth--;

        builder.append("Ok, tá-se. Obrigado!\n");

        return builder.toString();
    }

    @Override
    public String visit(NotNode node) {
        return node.getValueNode().accept(this) + " Só que não!";
    }

    @Override
    public String visit(PrintNode node) {
        return "Vai aí ao WhatsApp e escreve isto: " + node.getValueNode().accept(this) + "\n";
    }

    @Override
    public String visit(StringNode node) {
        return "o texto '" + node.getLiteral() + "'";
    }

    @Override
    public String visit(VariableAssignementNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Assume que comes a cobertura do pastel de nata ")
                .append(node.getVariableNode().accept(this))
                .append(" e voltas a espalhar nele ")
                .append(node.getAssignementNode().accept(this))
                .append(".\n");

        return builder.toString();
    }

    @Override
    public String visit(VariableDeclarationNode node) {
        StringBuilder builder = new StringBuilder();

        builder.append("Assume que tens um pastel de nata chamado ")
                .append(node.getVariableNode().accept(this));

        if(node.getInitializationNode() == null) {
            builder.append(" com nada (tal como os peixes).\n");
        }
        else {
            builder.append(" com ")
                    .append(node.getInitializationNode().accept(this))
                    .append(" a fazer de cobertura.\n");
        }

        return builder.toString();
    }

    @Override
    public String visit(VariableNode node) {
        return "'" + node.getName() + "'";
    }
}

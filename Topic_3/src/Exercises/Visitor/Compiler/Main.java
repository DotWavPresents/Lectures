package Exercises.Visitor.Compiler;

import Exercises.Visitor.Compiler.visitors.BritishCompiler;
import Exercises.Visitor.Compiler.visitors.JavaCompiler;
import Exercises.Visitor.Compiler.visitors.PythonCompiler;
import Exercises.Visitor.Compiler.visitors.RandomLanguageCompiler;
import Exercises.Visitor.Compiler.nodes.*;

public class Main {

    public static void main(String[] args) {
        MainNode program = new MainNode(
                new VariableDeclarationNode(new VariableNode("a"), new IntegerNode(5)),
                new VariableDeclarationNode(new VariableNode("b"), new IntegerNode(10)),
                new VariableDeclarationNode(new VariableNode("c")),
                new VariableDeclarationNode(new VariableNode("d"), new StringNode("Hello there!")),
                new VariableAssignementNode(new VariableNode("c"), new AdditionNode(new VariableNode("b"), new IntegerNode(2))),
                new IfNode(
                        new EqualsNode(new IntegerNode(12), new VariableNode("c")),
                            new PrintNode(new StringNode("Sup?")),
                            new IfNode(
                                    new NotNode(new LesserThanNode(new VariableNode("a"), new VariableNode("b"))),
                                    new PrintNode(new StringNode("Woooo!"))),
                                    new VariableAssignementNode(new VariableNode("a"), new IntegerNode(6))
                            )
        );

        // Compilers

        JavaCompiler javaCompiler = new JavaCompiler(); // TODO Complete this one
        PythonCompiler pythonCompiler = new PythonCompiler();
        BritishCompiler britishCompiler = new BritishCompiler();
        RandomLanguageCompiler randomLanguageCompiler = new RandomLanguageCompiler(); // TODO Complete this one with the language of your choice

        System.out.println("----<Java Program>---");
        System.out.println(javaCompiler.visit(program));
        System.out.println("----End <Java Program>---");

        System.out.println("----<Python Program>---");
        System.out.println(pythonCompiler.visit(program));
        System.out.println("----End <Python Program>---");

        System.out.println("----<British Program>---");
        System.out.println(britishCompiler.visit(program));
        System.out.println("----End <British Program>---");

        System.out.println("----<Random Language Program>---");
        System.out.println(randomLanguageCompiler.visit(program));
        System.out.println("----End <Random Language Program>---");
    }
}

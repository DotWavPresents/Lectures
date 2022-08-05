package Examples.Visitor.Farm;

public class Snail extends Animal {
    @Override
    public void visit(Onion onion) {
        System.out.println("I don't like onions...");
    }

    @Override
    public void visit(Potato potato) {
        System.out.println("I don't like potatoes...");
    }
}

package Examples.Visitor.Farm;

public class Cataloguer implements Visitor {
    @Override
    public void visit(Lettuce lettuce) {
        System.out.println("I'm identifying a lettuce. It has a nutritious value of " + lettuce.nutritiousValue());
    }

    @Override
    public void visit(Potato potato) {
        System.out.println("I'm identifying a potato. It has a nutritious value of " + potato.nutritiousValue());
    }

    @Override
    public void visit(Onion onion) {
        System.out.println("I'm identifying an onion. It has a nutritious value of " + onion.nutritiousValue());
    }
}

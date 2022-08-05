package Examples.Visitor.Farm;

public class Animal implements Visitor {

    private int fulfillment = 0;

    @Override
    public void visit(Lettuce lettuce) {
        System.out.println("*nomnomnom* tasty lettuce!");

        fulfillment += lettuce.nutritiousValue();
    }

    @Override
    public void visit(Potato potato) {
        System.out.println("*nomnomnom* tasty potato!");

        fulfillment += potato.nutritiousValue();
    }

    @Override
    public void visit(Onion onion) {
        System.out.println("*nomnomnom* meh onion!");

        fulfillment += onion.nutritiousValue();
    }

    public int getFulfillment() {
        return fulfillment;
    }
}

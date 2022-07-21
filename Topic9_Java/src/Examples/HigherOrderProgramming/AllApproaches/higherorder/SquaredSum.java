package Examples.HigherOrderProgramming.AllApproaches.higherorder;

public class SquaredSum implements Function {
    @Override
    public int apply(int accumulated, int element) {
        return element * element + accumulated;
    }
}

package Examples.HigherOrderProgramming.AllApproaches.higherorder;

public class NormalSum implements Function {
    @Override
    public int apply(int accumulated, int element) {
        return element + accumulated;
    }
}

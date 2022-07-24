package Examples.HigherOrderProgramming.HOP_Approaches.higherorder;

public class CubedSum implements Function {
    @Override
    public int apply(int accumulated, int element) {
        return element * element * element + accumulated;
    }
}

package Examples.HigherOrderProgramming.HOP_Approaches.higherorder;

public class Multiplication implements Function {
    @Override
    public int apply(int accumulated, int element) {
        return element * accumulated;
    }
}

package Examples.HigherOrderProgramming.HOP_Immitation.higherorder;

import java.util.List;

public class Average implements Function {
    @Override
    public int apply(int accumulated, int element) {
        return element + accumulated;
    }

    @Override
    public double finalOperation(List<Integer> list, int accumulated) {
        return ((double) accumulated) / list.size();
    }
}

package Examples.HigherOrderProgramming.HOP_Immitation.higherorder;

import java.util.List;

public interface Function {

    int apply(int accumulated, int element);

    double finalOperation(List<Integer> list, int accumulated);
}

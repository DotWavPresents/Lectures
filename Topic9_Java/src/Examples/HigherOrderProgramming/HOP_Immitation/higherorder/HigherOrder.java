package Examples.HigherOrderProgramming.HOP_Immitation.higherorder;

import java.util.List;

public class HigherOrder {

    public static double reduce(List<Integer> list, Function function) {
        int accumulated = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            accumulated = function.apply(accumulated, list.get(i));
        }

        return function.finalOperation(list, accumulated);
    }
}

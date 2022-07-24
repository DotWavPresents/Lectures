package Examples.HigherOrderProgramming.HOP_Approaches.higherorder;

import java.util.List;

public class HigherOrder {

    public static int reduce(List<Integer> list, Function function) {
        int accumulated = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            accumulated = function.apply(accumulated, list.get(i));
        }

        return accumulated;
    }
}

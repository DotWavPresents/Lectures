package Examples.HigherOrderProgramming.HOP_Immitation;

import Examples.HigherOrderProgramming.HOP_Immitation.higherorder.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4);

        // Inheritance approach
        System.out.println("Inheritance average: " + HigherOrder.reduce(testList, new Average()));

        // Nameless class
        System.out.println("Nameless class average: " + HigherOrder.reduce(testList, new Function() {
            @Override
            public int apply(int accumulated, int element) {
                return accumulated + element;
            }

            @Override
            public double finalOperation(List<Integer> list, int accumulated) {
                return ((double) accumulated) / list.size();
            }
        }));
    }
}

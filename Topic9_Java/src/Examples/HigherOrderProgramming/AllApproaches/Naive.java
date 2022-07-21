package Examples.HigherOrderProgramming.AllApproaches;

import java.util.List;

public class Naive {

    // Naive implementations
    public static int sum(List<Integer> list) {
        int sum = 0;

        for(Integer element : list) {
            sum += element;
        }

        return sum;
    }

    public static int sumSquared(List<Integer> list) {
        int sum = 0;

        for(Integer element : list) {
            sum += element * element;
        }

        return sum;
    }

    public static int sumCubed(List<Integer> list) {
        int sum = 0;

        for(Integer element : list) {
            sum += element * element * element;
        }

        return sum;
    }

    public static int multiplication(List<Integer> list) {
        int multiplication = 1;

        for(Integer element : list) {
            multiplication *= element;
        }

        return multiplication;
    }
}

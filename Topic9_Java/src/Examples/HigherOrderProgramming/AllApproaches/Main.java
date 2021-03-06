package Examples.HigherOrderProgramming.AllApproaches;

import Examples.HigherOrderProgramming.AllApproaches.higherorder.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4);

        // Naive approach
        System.out.println("Naive sum: " + Naive.sum(testList));
        System.out.println("Naive squared sum: " + Naive.sumSquared(testList));
        System.out.println("Naive cubed sum: " + Naive.sumCubed(testList));
        System.out.println("Naive multiplication: " + Naive.multiplication(testList));

        // Higher order approach
        System.out.println("Function sum: " + HigherOrder.reduce(testList, new NormalSum()));
        System.out.println("Function squared sum: " + HigherOrder.reduce(testList, new SquaredSum()));
        System.out.println("Function cubed sum: " + HigherOrder.reduce(testList, new CubedSum()));
        System.out.println("Function multiplication: " + HigherOrder.reduce(testList, new Multiplication()));

        // Lambda
        System.out.println("Lambda sum: " + HigherOrder.reduce(testList, (acc, el) -> el + acc));
        System.out.println("Lambda squared sum: " + HigherOrder.reduce(testList, (acc, el) -> el * el + acc));
        System.out.println("Lambda cubed sum: " + HigherOrder.reduce(testList, (acc, el) -> el * el * el + acc));
        System.out.println("Lambda multiplication: " + HigherOrder.reduce(testList, (acc, el) -> el * acc));

        // Method reference
        System.out.println("Method reference sum: " + HigherOrder.reduce(testList, (acc, el) -> add(acc, el)));
        System.out.println("Method reference squared sum: " + HigherOrder.reduce(testList, (acc, el) -> addSquared(acc, el)));
        System.out.println("Method reference cubed sum: " + HigherOrder.reduce(testList, (acc, el) -> addCubed(acc, el)));
        System.out.println("Method reference multiplication: " + HigherOrder.reduce(testList, (acc, el) -> multiply(acc, el)));

        // Direct Method reference
        System.out.println("Direct Method reference sum: " + HigherOrder.reduce(testList, Main::add));
        System.out.println("Direct Method reference squared sum: " + HigherOrder.reduce(testList, Main::addSquared));
        System.out.println("Direct Method reference cubed sum: " + HigherOrder.reduce(testList, Main::addCubed));
        System.out.println("Direct Method reference multiplication: " + HigherOrder.reduce(testList, Main::multiply));

        // Streams
        System.out.println("Stream sum: " + testList.stream().reduce(Main::add).get());
        System.out.println("Stream squared sum: " + testList.stream().reduce(Main::addSquared).get());
        System.out.println("Stream cubed sum: " + testList.stream().reduce(Main::addCubed).get());
        System.out.println("Stream multiplication: " + testList.stream().reduce(Main::multiply).get());

        // Mapping with streams
                                                        /*No need for parentheses here since the lambda only receives 1 argument*/
        System.out.println("Elements doubled: " + testList.stream().map(element -> element * 2));
    }


    // For method referenced lambdas
    public static int add(int acc, int el) {
        return acc + el;
    }

    public static int addSquared(int acc, int el) {
        return acc + el * el;
    }

    public static int addCubed(int acc, int el) {
        return acc + el * el * el;
    }

    public static int multiply(int acc, int el) {
        return acc * el;
    }
}

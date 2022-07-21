package Exercises.HigherOrderProgramming.Exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 9, 9, 10, 15, 25, 29, 67, 100);

        /* TODO 1.2: Create a class that implements 'Filter' called OddFilter, which returns true
            when the given element is an odd number*/

        // TODO 1.2: Uncomment this after creating the OddFilter class
        //System.out.println("Function odd filter: " + filter(testList, new OddFilter()));

        // TODO 1.3: Using lambdas only, create filters for the following:

        // TODO 1.3.1: Filter that keeps all elements that are multiples of 3
        //System.out.println("Lambda multiples of 3 filter: " + filter(testList, TODO));

        // TODO 1.3.2: Filter that keeps all elements that greater or equal than 25
        //System.out.println("Lambda greater than 25: " + filter(testList, TODO));

        // TODO 1.4: Using lambdas with method references, create filters AND METHODS for the following:

        // TODO 1.4.1: Filter that keeps all elements that are smaller than the ((sum of all list's elements) / 10)
        //System.out.println("Method reference smaller than sum / 10 filter: " + filter(testList, TODO));

        // TODO 1.5: Using lambdas with direct method references, create filters AND METHODS for the following:

        // TODO 1.5.1: Filter that keeps all elements such that the filtered list does not contain repetitions
        //System.out.println("Direct Method reference repeated filter: " + filter(testList, TODO));

        // TODO 1.6: Using streams with whatever lambda approach you'd like, solve the following:

        /* TODO 1.6.1: Replace the 'TODO' such that we get the division of the 1st element by the 2nd,
        *   that result divided by the 3rd element, that result divided by the 4th, and so on...
        * Ex: Passing a list containing [8, 2] returns 4
        * Ex: Passing a list containing [16, 2, 4, 2] returns 1*/
        //System.out.println("Division of elements: " + Arrays.asList(16, 2, 4, 2).stream().reduce(TODO).get()); // Prints 1

        // TODO 1.6.2: Replace the 'TODO' such that we get all elements smaller than 30
        //System.out.println("Smaller than 30: " + testList.stream().filter(TODO).toList());

        // TODO 1.6.3: Replace the 'TODO' such that we get all elements squared
        //System.out.println("All elements squared: " + testList.stream().map(TODO).toList());

        // TODO 1.7: Using the 'filter' and/or 'reduce' and/or 'map'

        Arrays.asList().stream().

        // TODO 1.6.3: Replace the 'TODO'
    }

    /**
     *  Filters the elements of the given list, keeping the items that pass
     * the filter and discarding those who don't
     *  Note: This filter is different from the Python one. Here, we are accepting items
     * that pass the filter, while in Python we were discarding the items that passed the filter
     * @param list
     *  The list to filter
     * @param filter
     *  The filter to apply to the elements
     * @return
     *  A new list containing the filtered items
     */
    public static List<Integer> filter(List<Integer> list, Filter filter) {
        // TODO 1.1: Implement this

        return null;
    }

    // TODO 1.4: Create necessary methods

    // TODO 1.5: Create necessary methods
}

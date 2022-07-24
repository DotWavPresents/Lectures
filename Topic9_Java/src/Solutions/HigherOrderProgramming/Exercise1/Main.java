package Solutions.HigherOrderProgramming.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 9, 9, 10, 15, 25, 29, 67, 100);

        /* TODO 1.2: Create a class that implements 'Filter' called OddFilter, which returns true
            when the given element is an odd number.

            Uncomment the 'System.out.print...' and solve the problem

            */
        System.out.println("Function odd filter: " + filter(testList, new OddFilter()));


        // TODO 1.3: Using lambdas only, create filters for the following:

        // TODO 1.3.1: Filter that keeps all elements that are multiples of 3
        System.out.println("Lambda multiples of 3 filter: " + filter(testList, (list, el) -> el % 3 == 0));

        // TODO 1.3.2: Filter that keeps all elements that greater or equal than 25
        System.out.println("Lambda greater than 25 filter: " + filter(testList, (list, el) -> el >= 25));


        // TODO 1.4: Using lambdas with method references, create filters AND METHODS for the following:

        // TODO 1.4.1: Filter that keeps all elements that are smaller than the ((sum of all list's elements) / 10)
        System.out.println("Method reference smaller than sum / 10 filter: " + filter(testList, (list, el) -> smallerThanListDividedBy10Filter(testList, el)));


        // TODO 1.5: Using lambdas with direct method references, create filters AND METHODS for the following:

        // TODO 1.5.1: Filter that keeps all elements bigger than 10
        System.out.println("Bigger than 10 filter: " + filter(testList, Main::biggerThan10Filter));


        // TODO 1.6: Using streams with whatever lambda approach you'd like, solve the following:

        /* TODO 1.6.1: Replace the 'TODO' such that we get the division of the 1st element by the 2nd,
        *   that result divided by the 3rd element, that result divided by the 4th, and so on...
        * Ex: Passing a list containing [8, 2] returns 4
        * Ex: Passing a list containing [16, 2, 4, 2] returns 1
        * Note: stream().reduce() receives a Binary Operation interface where the 1st element is the accumulation and the 2nd is the element,
        * just like in the Python examples with 'lambda acc, el: el + acc', which in Java would be '(acc, el) -> acc + el'
        * */
        System.out.println("Division of elements: " + Arrays.asList(16, 2, 4, 2).stream().reduce((acc, el) -> acc / el).get()); // Prints 1

        // TODO 1.6.2: Replace the 'TODO' such that we get all elements smaller than 30
        System.out.println("Smaller than 30: " + testList.stream().filter(element -> element < 30).toList());

        // TODO 1.6.3: Replace the 'TODO' such that we get all elements squared
        System.out.println("All elements squared: " + testList.stream().map(element -> element * element).toList());


        // TODO 1.7: Using the 'filter' and/or 'reduce' and/or 'map'

        // TODO 1.7.1: Print the sum of all even numbers
        System.out.println("Sum of even numbers: " + testList.stream().filter(el -> el % 2 == 0).reduce((acc, el) -> acc + el).get());

        // TODO 1.7.2: Print the sum of all list's numbers squared
        // Ex: Passing [1, 2, 3] should return 1 * 1 + 2 * 2 + 3 * 3, which is 14
        System.out.println("Sum of elements squared: " + testList.stream().map(el -> el * el).reduce((acc, el) -> acc + el).get());

        // TODO 1.7.3: Print the average of all odd numbers
        System.out.println("Average of odd numbers: " + testList.stream().filter(el -> el % 2 == 1).reduce((acc, el) -> acc + el).get()
            / ((double) testList.stream().filter(el -> el % 2 == 1).count()));
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
        List<Integer> filteredList = new ArrayList<>();

        for(Integer element : list) {
            if(filter.apply(list, element)) {
                // Element passed the filter
                filteredList.add(element);
            }
        }

        return filteredList;
    }

    // TODO 1.4: Create necessary methods

    // This is inefficient, but efficiency is not the Topic
    public static boolean smallerThanListDividedBy10Filter(List<Integer> entireList, Integer element) {
        int sumAux = 0;

        // Adding up all the elements in the entire list (not just the filtered list)
        for(Integer el : entireList) {
            sumAux += el;
        }

        sumAux /= 10;

        return element < sumAux;
    }

    // TODO 1.5: Create necessary methods

    public static boolean biggerThan10Filter(List<Integer> filteredList, Integer element) {
        return element > 10;
    }
}

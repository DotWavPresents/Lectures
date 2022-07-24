package Examples.HigherOrderProgramming.Utilities;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Jordan", "Ramsey", 10),
                new Person("BlackKnight", "625", 21),
                new Person("Your", "sole", 5),
                new Person("Your", "Momma", 45),
                new Person("Coffee", "Man", 60),
                new Person("Jordan", "Dotwav", 30),
                new Person("Apple", "Juice", 25),
                new Person("Orange", "Juice", 20),
                new Person("Sexy", "Man", 69),
                new Person("Vim", "Hax", 23),
                new Person("Marvelous", "Nothing", 0)
        );

        // Sorting by age
        people.sort(new AgeComparator());
        System.out.println("Inheritance Sorted by age: " + people);

        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Lambda with method reference Sorted by age: " + people);

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Direct method reference Sorted by age: " + people);

        // Sorting by first name
        people.sort(Comparator.comparing(Person::getFirstName));
        System.out.println("Sorted by name: " + people);

        // Sorting by first and last name
        people.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println("Sorted by name: " + people);

        // Sorting by first and last name reversed
        people.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName).reversed());
        System.out.println("Sorted by name reversed: " + people);

        // Sorting without modifying the original list
        System.out.println("Sorted by age without modifying original list: " + people.stream().sorted(Comparator.comparingInt(Person::getAge)).toList());
    }
}

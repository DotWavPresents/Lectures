package Exercises.HigherOrderProgramming.Exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> zoo = Arrays.asList(
                new Animal("Cat", "Pantufa", 5),
                new Animal("Cat", "Zelda", 4),
                new Animal("Cat", "Kit the Cat", 8),
                new Animal("Cat", "Kitty", 3),
                new Animal("Dog", "Barkus", 12),
                new Animal("Dog", "Kitty", 7),
                new Animal("Dog", "Mimi", 10),
                new Animal("Lion", "RaaawrXD", 1),
                new Animal("Lion", "Pantufa", 5)
        );

        // Note: For all these exercises, do the print verification yourself

        // TODO 1: Sort all animals by name. If there's a tie, sort them by age

        // zoo.sort(TODO);
        System.out.println("Sorted by name and age: " + zoo);


        // TODO 2: Sort all animals by name. If there's a tie, sort them by species

        // zoo.sort(TODO);
        System.out.println("Sorted by name and species: " + zoo);


        // TODO 3: Print all cats sorted by name
        // Hint: Use streams

        //System.out.println("Sorted cats:" + zoo.stream().TODO.toList());


        // TODO 4: Print all dogs sorted by age
        // Hint: Use streams

        //System.out.println("Sorted dogs:" + zoo.stream().TODO.toList());


        // TODO 5: Print the 3 oldest animals
        // Hint: use stream().limit()

        //System.out.println("3 oldest animals:" + zoo.stream().TODO.toList());


        // TODO 6: Between all animals, what's the animal with the smallest name?

        //System.out.println("Animal with largest name: " + zoo.stream().TODO.get());
    }
}

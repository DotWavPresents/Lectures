package Examples.Visitor.Farm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();

        List<Vegetable> vegetables = new ArrayList<>();

        // The farm harvests vegetables

        for(int i = 0; i < 10; i++) {
            vegetables.add(farm.harvest());
        }

        // A cataloguer visits the farm
        Cataloguer cataloguer = new Cataloguer();

        for(Vegetable vegetable : vegetables) {
            vegetable.accept(cataloguer);
        }

        // An animal visits the farm
        Animal animal = new Animal();

        for(Vegetable vegetable : vegetables) {
            vegetable.accept(animal);
        }

        System.out.println("Ohh no! The animal ate all the vegetables, amounting to a total of " + animal.getFulfillment() + " nutritious value!");

        // An animal visits the farm
        Snail snail = new Snail();

        for(Vegetable vegetable : vegetables) {
            vegetable.accept(snail);
        }

        System.out.println("Ohh no! The snail all the lettuce, amounting to a total of " + snail.getFulfillment() + " nutritious value!");
    }
}

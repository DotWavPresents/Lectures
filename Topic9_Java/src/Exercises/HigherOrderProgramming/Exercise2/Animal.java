package Exercises.HigherOrderProgramming.Exercise2;

public class Animal {

    private final String species;
    private final String name;
    private final int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old " + species;
    }
}

package Examples.HigherOrderProgramming.Utilities;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int person1Age = person1.getAge();
        int person2Age = person2.getAge();

        if(person1Age > person2Age) {
            return 1;
        }

        if(person1Age < person2Age) {
            return -1;
        }

        return 0;
    }
}

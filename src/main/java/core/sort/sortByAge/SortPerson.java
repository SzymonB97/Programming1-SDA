package core.sort.sortByAge;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class SortPerson {

    public static void main(String[] args) {
        List<Person> humanList = new LinkedList<>();
        Person person1 = new Person("Jan", "Kowalski", 22);
        Person person2 = new Person("Waldek", "Kowalski", 30);
        Person person3 = new Person("Aneta", "Kowalska", 28);

        humanList.add(person1);
        humanList.add(person2);
        humanList.add(person3);

        System.out.println(sortByAge(humanList));
    }

    private static List<Person> sortByAge(List<Person> humanList) {
        Collections.sort(humanList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else return 1;
            }
        });

        return humanList;
    }
}

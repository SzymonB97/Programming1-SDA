package core.sort;

import java.util.*;

class CollectionsSort {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        List randomNumbers = generateNumbers(random, numbers);
        System.out.println(randomNumbers);

        List result = sortNumbers(randomNumbers);
        System.out.println(result);
    }

    private static List<Integer> sortNumbers(List<Integer> tab) {
        Collections.sort(tab, (o1, o2) -> {
            //sortowanie z ustawieniem na początku liczb parzystych a potem nieparzystych (rosnąco)
            // -1 odpowiada za o1, a 1 odpowiada za o2

            //dzięki takiemu warunkowi mamy od razu porównanie wielkości liczby
            // gdy obie są nieprzyste lub gdy obie są parzyste
            if (o1 % 2 == o2 % 2) {
                o1.compareTo(o2);
            } else if (o1 % 2 == 0) {
                return -1;
            } else if (o2 % 2 == 0) {
                return 1;
            }

            return 0;
        });

        return tab;
    }

    private static List<Integer> generateNumbers(Random random, List<Integer> numbers) {
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        return numbers;
    }
}

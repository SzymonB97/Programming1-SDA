package core.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
        Collections.sort(tab);

        return tab;
    }

    private static List<Integer> generateNumbers(Random random, List<Integer> numbers) {
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }

        return numbers;
    }
}

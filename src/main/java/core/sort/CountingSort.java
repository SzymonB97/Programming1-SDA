package core.sort;

import java.util.Arrays;

class CountingSort {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 7, 8, 6, 6, 8, 9, 1, 3, 3, 4, 5, 5, 4, 4, 6, 7, 9, 9};

        int[] result = sortNumbers(numbers);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sortNumbers(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        int[] occurrencesTab = new int[max + 1];
        Arrays.fill(occurrencesTab, 0);
        for (int i = 0; i < numbers.length; i++) {
            occurrencesTab[numbers[i]]++;
        }

        int counter = 0;
        //dwie pętle ale złożoność liniowa
        for (int i = 0; i < occurrencesTab.length; i++) {
            for (int j = 0; j < occurrencesTab[i]; j++) {
                numbers[counter++] = i;
            }
        }

        return numbers;
    }
}

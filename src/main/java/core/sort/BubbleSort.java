package core.sort;

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 3, 2, 9};

        int[] result = sortNumbers(numbers);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sortNumbers(int[] numbers) {
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}

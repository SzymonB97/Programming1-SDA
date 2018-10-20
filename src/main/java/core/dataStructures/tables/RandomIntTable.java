package core.dataStructures.tables;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomIntTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wyrazów");
        int length = scanner.nextInt();

        int[] randomTable = getRandomNumbers(length);
        System.out.println(Arrays.toString(randomTable));
        System.out.println("Liczby niemalejące: " + checkIfSort(randomTable, true));
        System.out.println("Liczby nie rosnące: " + checkIfSort(randomTable, false));
    }

    private static boolean checkIfSort(int[] randomTable, boolean isGreater) {

        for (int i = 1; i < randomTable.length; i++) {
            if (isGreater && randomTable[i - 1] >= randomTable[i]) {
                return false;
            }

            if (!isGreater && randomTable[i - 1] <= randomTable[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] getRandomNumbers(int length) {
        int[] random = new int[length];
        Random getRandom = new Random();

        for (int i = 0; i < random.length; i++) {
            random[i] = getRandom.nextInt(50);
        }

        return random;
    }
}

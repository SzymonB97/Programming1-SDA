package core.dataStructures.tables;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class SumOfTables {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy nr 1");
        int length1 = scanner.nextInt();
        System.out.println("Podaj długość tablicy nr 2");
        int length2 = scanner.nextInt();

        int[] table1 = getTable(length1);
        int[] table2 = getTable(length2);
        int[] result = getSumTable(table1, table2);

        System.out.println(Arrays.toString(table1));
        System.out.println(Arrays.toString(table2));
        System.out.println(Arrays.toString(result));
    }

    private static int[] getSumTable(int[] table1, int[] table2) {
        int biggerLength;
        int smallerLength;
        if (table1.length > table2.length) {
            biggerLength = table1.length;
            smallerLength = table2.length;
        } else {
            biggerLength = table2.length;
            smallerLength = table1.length;
        }

        int[] tab = new int[biggerLength];
        for (int i = 0; i < smallerLength; i++) {
            tab[i] = table1[i] + table2[i];
        }

        for (int i = biggerLength - smallerLength + 1; i < tab.length; i++) {
            if (biggerLength == table1.length) {
                tab[i] = table1[i];
            } else tab[i] = table2[i];
        }

        return tab;
    }

    private static int[] getTable(int length) {
        int[] tab = new int[length];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(50);
        }

        return tab;
    }
}

package core.dataStructures.tables;

import java.util.Arrays;
import java.util.Scanner;

class Fibonnacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wyrazów");
        int length = scanner.nextInt();

        long[] result = calculate(length);
        System.out.println(Arrays.toString(result));
    }

    private static long[] calculate(int length) {
        long[] fibonacci = new long[length];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}

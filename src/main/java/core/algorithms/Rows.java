package core.algorithms;

import java.util.Scanner;
import java.util.stream.IntStream;

class Rows {

    public static void main(String[] args) {
        int length = getInput();

        if (checkInput(length)) return;

        rowOne(length);
        System.out.println("\n-----------");
        rowTwo(length);
        System.out.println("\n-----------");
        rowThree(length);
        System.out.println("\n-----------");
        rowFour(length);
    }

    private static void rowFour(int length) {
        int firstNumber = 1;
        int secondNumber = 1;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        for (int i = 2; i < length; i++) {
            int temp = secondNumber;
            secondNumber = firstNumber + secondNumber;
            System.out.print(secondNumber + " ");
            firstNumber = temp;
        }
    }

    private static void rowThree(int length) {
        //mój sposób
        for (int i = 0, j = 2, k = 1; i < length; i++) {
            System.out.print(j + " ");
            j += 2 * k;
            if (j == 8) {
                k = -1;
            } else if (j == 2) {
                k = 1;
            }
        }

        //2 sposób
        System.out.println();
        for (int i = 1, result = 2, multiplier = 1; i <= length; i++, result += 2 * multiplier) {
            if (result == 8) {
                multiplier = -1;
            } else if (result == 2) {
                multiplier = 1;
            }
            System.out.print(result + " ");
        }

        //3 sposób
        System.out.print("\n2 ");
        for (int i = 1, result = 4, multiplier = 1; i < length; i++, result += 2 * multiplier) {
            if (i % 3 == 0) multiplier *= -1;
            System.out.print(result + " ");
        }
    }

    private static void rowTwo(int length) {
        //mój sposób
        //pętla z dwoma licznikami
        for (int i = -1, j = 1; j <= length; j++) {
            System.out.print(i + " ");
            i += (int) Math.pow(2, j);
        }

        //2 sposób
        System.out.println();
        for (int k = -1, j = 1, i = 1; i <= length; k += j, i++) {
            j *= 2;
            System.out.print(k + " ");
        }
    }

    private static void rowOne(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i * 2 - 1 + " ");//wypisanie w jednej linii
        }

        //2 sposób
        System.out.println();
        for (int i = 1; i <= 2 * length; i += 2) {
            System.out.print(i + " ");
        }

        //lambda
        /*IntStream.range(1, length + 1).forEach(
                t -> System.out.println(t * 2 - 1)
        );*/
    }

    private static boolean checkInput(int length) {
        if (length < 1 || length > 20) {
            System.out.println("Liczba poza zakresem");
            return true;
        }
        return false;
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość ciągu");
        return scanner.nextInt();
    }
}

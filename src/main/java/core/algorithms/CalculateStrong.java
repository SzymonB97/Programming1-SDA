/*Program obliczający silnię podanej liczby*/

package core.algorithms;

import java.util.Scanner;

class CalculateStrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Silnia podanej liczby wynosi: " + calculate(number));
    }

    private static int calculate(int number) {
        int result = 1;

        if (number == 0) {
            return result;
        }

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
}

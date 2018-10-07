package core.recursion;

import java.util.Scanner;

class CalculateStrongV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Silnia podanej liczby wynosi: " + calculate(number));
    }

    private static int calculate(int number) {
        if (number < 2) {
            return 1;
        }

        return number * calculate(number - 1);
    }
}

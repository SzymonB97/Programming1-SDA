package core.recursion;

import java.util.Scanner;

class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Suma cyfr podanej liczby wynosi: " + calculate(number));
    }

    private static int calculate(int n) {
        if (n > 0) {
            return n % 10 + calculate(n / 10);
        }

        return 0;
    }
}

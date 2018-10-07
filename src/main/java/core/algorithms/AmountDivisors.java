/*
Program obliczający sumę liczb będących dzielnikami zadanej liczby.
*/


package core.algorithms;

import java.util.Scanner;

class AmountDivisors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Suma dzielników podanej liczby wynosi: " + calculate(number));
    }

    private static int calculate(int number) {
        int amount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                amount += i;
            }
        }

        return amount;
    }
}

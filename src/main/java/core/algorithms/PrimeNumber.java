/*
Program sprawdzający czy podana liczba jest pierwsza.
*/

package core.algorithms;

import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Podana liczba jest pierwsza: " + checkIfPrime(number));
    }

    private static boolean checkIfPrime(int number) {
        int numberOfDivisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors ++;
            }
        }

        if (number == 1) {
            return true;
        } else return numberOfDivisors == 2;
    }
}

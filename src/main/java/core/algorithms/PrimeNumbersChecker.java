/*Program wypisuje wszystkie liczby z zakresu od 2 do n
Algorytm jest kwadratowy n^2
Sito Eratostenesa zmniejsza złożoność obliczeniową do n*loglog(n)
Dzięki czemu program działa dużo szybciej*/

package core.algorithms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class PrimeNumbersChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double startTime = System.currentTimeMillis();
        //printPrimes(n);
        printErastotenesPrimes(n);
        double endTime = System.currentTimeMillis();
        System.out.println("Czas kompilacji: " + (endTime - startTime) / 1000 + " s");

    }

    private static void printErastotenesPrimes(int n) {
        boolean[] primes = new boolean[n + 1];

        // przyporządkowanie każdemu indeksowi wartości true
        Arrays.fill(primes, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == true) {
                for (int j = i * i; j <= n; j += i) primes[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i] == true) {
                System.out.println(i);
            }
        }

        //druga wersja wypisania
        /*IntStream.range(2, n)
                .filter(t -> primes[t] == true)
                .forEach(System.out::println);*/
    }

    private static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}

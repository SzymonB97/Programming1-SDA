/*Program liczący n-ty wyraz ciągu Fibonnaciego*/

package core.recursion;

import java.util.Scanner;

class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int index = scanner.nextInt();

        System.out.println("Wynik: " + fibonacci(index));
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}

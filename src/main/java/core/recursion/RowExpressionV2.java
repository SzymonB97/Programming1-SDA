package core.recursion;

import java.util.Scanner;

class RowExpressionV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj indeks wyrazu ciągu");
        int number = scanner.nextInt();
        if (number < 1) throw new IllegalArgumentException("Podaj liczbę większą od zera");

        System.out.println("Wartość wyrazu nr " + number + " wynosi: " + calculate(number));
    }

    private static int calculate(int n) {
        if (n == 1) return -1;

        return -calculate(n-1) * n - 3;
    }
}

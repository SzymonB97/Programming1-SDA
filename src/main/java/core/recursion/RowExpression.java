package core.recursion;

import java.util.Scanner;

class RowExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        double index = scanner.nextInt();

        System.out.println("Wynik: " + row(index));
    }

    private static double row(double n) {
        if (n == 1) return 1;
        if (n == 2) return 0.5;

        return -row(n-1) * row(n-2);
    }
}

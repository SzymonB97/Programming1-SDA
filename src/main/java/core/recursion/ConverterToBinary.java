package core.recursion;

import java.util.Scanner;

class ConverterToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do zamiany na postać binarną");
        int number = scanner.nextInt();

        converter(number);
    }

    private static void converter(int n) {
        if (n > 0) {
           converter(n / 2);
           System.out.printf("%d", n % 2);
        }
    }
}
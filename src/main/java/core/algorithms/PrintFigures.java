package core.algorithms;

import java.util.Scanner;

class PrintFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość");
        int height = scanner.nextInt();

        triangle(height);
        System.out.println("\n-------------");
        diagonal(height);
        System.out.println("\n-------------");
        drawX(height);
        System.out.println("\n-------------");
        rectangular(height);
        System.out.println("\n-------------");
    }

    private static void rectangular(int h) {
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < h; j++) {
                /*można to skompresować do jednej metody na uniwersalną zmienną dla 'i' i 'j'*/
                if (i == 0 || i == h - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == h - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
    }

    private static void drawX(int h) {
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < h; j++) {
                if (i == j || i + j + 1 == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    private static void diagonal(int h) {
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < h; j++) {
                if (i == j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
    }

    private static void triangle(int h) {
        //najlepiej sprawdzić dziłanie debugerem
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < h; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
        }
    }
}

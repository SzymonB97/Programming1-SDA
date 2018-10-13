/*
Zad dodatkowe 1.Mamy dużo liczb od 1 do 10. Zliczamy ile jest różnych liczb (zlożoność liniowa)

np. 1 2 6 7 3 2 3 4 6 8 5 3 2 1 1 1 1 1 1 2 2 3 5 6 5 5 5 5 5 5 5 5 5 1
*/

package core.algorithms.additional1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class UniqueNumbers {

    final static String FILE_PATH = "D:\\Projekty Java\\programming1\\src\\main\\java\\core\\algorithms\\additional1\\numbers";

    public static void main(String[] args) {

        calculate();
    }

    private static void calculate() {

        //zerujemy tablicę, każde zero odpowiada za jedną liczbę i zlicza jej wystąpienia
        //na tej podstawie wyznacza ilość liczb (nie wliczając powtórzeń)
        int[] amount = new int[10];
        int unique = 0;
        Arrays.fill(amount, 0);
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                amount[number - 1] ++;
            }

            for (int i = 0; i < amount.length; i++) {
                if (amount[i] != 0) unique++;
            }

            System.out.println("Wystąpienia liczb: " + Arrays.toString(amount));
            System.out.println("Ilość liczb: " + unique);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

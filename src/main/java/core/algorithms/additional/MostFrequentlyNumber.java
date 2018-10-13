/*Zad dodatkowe 2. Mamy liczby z zadania 1, należy obliczyć naczęściej występującą liczbę (złożoność liniowa)*/

package core.algorithms.additional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class MostFrequentlyNumber {

    final static String FILE_PATH = "D:\\Projekty Java\\programming1\\src\\main\\java\\core\\algorithms\\additional\\numbers";

    public static void main(String[] args) {

        calculate();
    }

    private static void calculate() {

        int[] amount = new int[10];
        int max = 0;
        int result = 0;
        Arrays.fill(amount, 0);
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                amount[number - 1] ++;
            }

            for (int i = 0; i < amount.length; i++) {
                if (amount[i] > max) {
                    result = i + 1;
                    max = amount[i];
                }
            }

            System.out.println("Wystąpienia liczb: " + Arrays.toString(amount));
            System.out.println("Najczęściej występująca liczba to: " + result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

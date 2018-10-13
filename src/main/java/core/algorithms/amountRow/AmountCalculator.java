package core.algorithms.amountRow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AmountCalculator {

    final static String FILE_PATH = "D:\\Projekty Java\\programming1\\src\\main\\java\\core\\algorithms\\amountRow\\data";

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {

        int sum = 0;
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextInt()) {
                int digit = scanner.nextInt();
                sum += digit;
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

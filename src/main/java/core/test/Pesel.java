package core.test;

import java.util.Scanner;

class Pesel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfTests; i++) {
            String pesel = scanner.next();

            char result = checkIfPeselIsCorrect(pesel);
            System.out.println(result);
        }
    }

    private static char checkIfPeselIsCorrect(String pesel) {
        int sum = 0;
        int multiplier = 0;


        for (int i = 0, k = 0; i < pesel.length(); i++, k++) {
            if (k > 2) {
                k = 1;
                multiplier = multiplier + (int) Math.pow(2, k);
            } else multiplier = multiplier + (int) Math.pow(2, k);
            if (multiplier > 9 || i == pesel.length() - 1) {
                k = 0;
                multiplier = k + (int) Math.pow(2, k);
            }

            sum += Integer.parseInt(String.valueOf(pesel.charAt(i))) * multiplier;
        }

        if (sum > 0) {
            if (sum % 10 == 0) return 'D';
        }

        return 'N';
    }
}

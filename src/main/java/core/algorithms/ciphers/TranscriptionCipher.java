package core.algorithms.ciphers;

import java.util.Scanner;

class TranscriptionCipher {

    public static void main(String[] args) {
        System.out.println("Podaj tekst do zaszyfrowania");
        String plainText = getText();

        String encriptedText = encrypt(plainText);
        String decryptedText = encrypt(encriptedText);

        System.out.println("encryptedText: " + encriptedText);
        System.out.println("decryptedText: " + decryptedText);
    }

    private static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        char first;
        char second;

        for (int i = 0; i <= text.length() - 2; i += 2) {
            first = text.charAt(i);
            second = text.charAt(i + 1);
            result.append(second).append(first);
        }

        if (text.length() % 2 != 0) result.append(text.charAt(text.length() - 1));

        return result.toString();
    }

    private static String getText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

package core.algorithms.ciphers;

import java.util.Scanner;

class VigenereCipher {

    private static final int ALPHABET_LENGTH = 26;
    private static final char[][] VIGINERE_MATRIX = new char[ALPHABET_LENGTH][ALPHABET_LENGTH];


    public static void main(String[] args) {
        System.out.println("Podaj tekst do zaszyfrowania");
        String plainText = getInputText();

        final String key = generateKey(plainText);
        generateMatrix();
        printMatrix();
        String result = encrypt(plainText, key);
        System.out.println("\nEncrypted text: " + result);
    }

    private static String encrypt(String plainText, String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            result.append(VIGINERE_MATRIX[plainText.charAt(i) - 'A'][key.charAt(i) - 'A']);
        }

        return result.toString();
    }

    private static String generateKey(String text) {
        String initkey = "BREAK";
        StringBuilder key = new StringBuilder(initkey);

        if (text.length() <= key.length()) {
            return initkey;
        }

        for (int i = 0; i < text.length() - initkey.length(); i++) {
            key.append(initkey.charAt(i % initkey.length()));
        }

        return key.toString();
    }

    private static String getInputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printMatrix() {
        for (int i = 0; i < ALPHABET_LENGTH; i++) {
            System.out.println();
            for (int j = 0; j < ALPHABET_LENGTH; j++) {
                System.out.print(VIGINERE_MATRIX[i][j] + " ");
            }
        }
    }

    private static void generateMatrix() {
        for (int i = 0; i < ALPHABET_LENGTH; i++) {
            for (int j = 0; j < ALPHABET_LENGTH; j++) {
                VIGINERE_MATRIX[i][j] = (char)('A' + ((i+j) % ALPHABET_LENGTH));
            }
        }
    }
}

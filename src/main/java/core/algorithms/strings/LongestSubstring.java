package core.algorithms.strings;

import java.util.Scanner;

class LongestSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst nr 1");
        String text1 = scanner.nextLine();
        System.out.println("Podaj tekst nr 2");
        String text2 = scanner.nextLine();

        String result = findTheLongestSubstring(text1, text2);
        System.out.println(result);
    }

    private static String findTheLongestSubstring(String text1, String text2) {
        String cut;
        String longest = "";
        for (int j = 0; j < text1.length(); j++) {
            for (int i = 0; i <= text1.length() - j; i++) {
                cut = text1.substring(j, j + i);

                if (text2.contains(cut) && cut.length() > longest.length()) {
                    longest = cut;
                }
            }
        }

        return longest;
    }
}

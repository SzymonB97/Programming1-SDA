//dokończyć
//sprawdzić Gita

package core.algorithms.strings;

import java.util.ArrayList;
import java.util.Scanner;

class Palindroms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String text = scanner.nextLine();

        ArrayList result = findPalindroms(text);
        System.out.println(result);
    }

    private static ArrayList findPalindroms(String text) {
        ArrayList palindromsTab = new ArrayList();
        String cut;
        String reverse;
        for (int j = 2; j < text.length() + 2; j++) {
            for (int i = 0; i <= text.length() - j; i++) {
                cut = text.substring(i, i + j);
                reverse = new StringBuilder(cut).reverse().toString();
                if (cut.equals(reverse)) {
                    palindromsTab.add(cut);
                }
            }
        }

        return palindromsTab;
    }
}

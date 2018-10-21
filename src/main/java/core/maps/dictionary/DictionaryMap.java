package core.maps.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class DictionaryMap {

    static final String FILE_PATH = "D:\\Projekty Java\\programming1\\src\\main\\java\\core\\maps\\dictionary\\dictionary";

    public static void main(String[] args) {
        String word = getWordToTranslate();

        Map<String, String> dictionary = readWords();

        String translate = translate(word, dictionary);

        System.out.println(translate);
        System.out.println(dictionary);
    }

    private static String translate(String word, Map<String, String> dictionary) {
        return dictionary.getOrDefault(word, "nie ma takiego słowa w słowniku");
    }

    private static Map<String, String> readWords() {
        Map<String, String> dictionary = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(FILE_PATH));

            while (scanner.hasNextLine()) {
                //String[] lineWords = scanner.nextLine().split(" ");

                String key = scanner.next();
                String value = scanner.next();

                dictionary.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dictionary;
    }

    private static String getWordToTranslate() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

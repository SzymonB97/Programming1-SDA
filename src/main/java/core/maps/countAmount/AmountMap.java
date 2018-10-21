package core.maps.countAmount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AmountMap {

    private static final String FILE_PATH = "D:\\Projekty Java\\programming1\\src\\main\\java\\core\\maps\\countAmount\\words";

    public static void main(String[] args) {
        Map<String, Integer> amount = getWordsAndCalculate();

        System.out.println(amount);
    }

    private static Map<String, Integer> getWordsAndCalculate() {
        Map<String, Integer> amount = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(FILE_PATH));
            while (scanner.hasNext()) {
                Integer value = 1;
                String key = scanner.next();

                if (amount.containsKey(key)) {
                    value = amount.get(key) + 1;
                }

                amount.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return amount;
    }
}

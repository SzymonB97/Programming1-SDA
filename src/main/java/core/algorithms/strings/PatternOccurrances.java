package core.algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PatternOccurrances {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String text = "ala1ala ma kota, ala, ala";
        String pattern = "ala";

        //nie wypisuje ostatniego wystąpienia
        /*findPattern(list, text, pattern);
        System.out.println(list);*/
        System.out.println(findPatternV2(text, pattern));
    }

    private static List findPatternV2(String text, String pattern) {
        int index = 0;
        List result = new ArrayList();
        do {
            index = text.indexOf(pattern, index);
            if (index == -1) break;
            result.add(Arrays.asList(index, index + pattern.length() - 1));
            index++;
        } while (true);

        return result;
    }

    private static void findPattern(ArrayList list, String text, String pattern) {
        if (text.contains(pattern)) {
            for (int i = 0; i < text.length(); i++) {
                int index = text.indexOf(pattern, i);
                if (index == -1) break;

                ArrayList listOfIndex = new ArrayList();
                listOfIndex.add(index);
                listOfIndex.add(index + pattern.length() - 1);
                list.add(listOfIndex);
                i += index;
            }
        }
    }
}

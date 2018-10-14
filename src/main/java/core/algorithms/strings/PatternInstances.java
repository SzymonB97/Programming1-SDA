package core.algorithms.strings;

import java.util.ArrayList;

class PatternInstances {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String text = "ala1ala ma kota, ala, ala";
        String pattern = "ala";

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
        System.out.println(list);
    }
}

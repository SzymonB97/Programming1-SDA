package core.maps.comparisonOfMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class HashAndTreeMap {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = getElements();
        Map<Integer, Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println(hashMap);
        System.out.println(treeMap);
    }

    private static Map<Integer, Integer> getElements() {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            Integer key = scanner.nextInt();
            hashMap.put(key, key * 2);
        }

        return hashMap;
    }
}

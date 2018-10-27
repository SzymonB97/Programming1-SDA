package core.test;

import java.util.Arrays;
import java.util.List;

class NumbersChainOtherVersion {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 8, 5, 3, 8);

        reverse(numbers, numbers.size() - 1);
    }

    private static void reverse(List<Integer> numbers, int i) {
        if (i < 0) {
            return;
        }

        System.out.println(numbers.get(i));
        reverse(numbers, i - 1);
    }
}

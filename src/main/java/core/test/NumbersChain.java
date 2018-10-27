package core.test;

import java.util.Arrays;
import java.util.List;

class NumbersChain {

    public static void main(String[] args) {
        List<Integer> chain = Arrays.asList(1, 2, 3, 8, 5, 3, 8);

        printReverse(chain, chain.size() - 1);
    }

    private static Integer printReverse(List<Integer> chain, int i) {
        if (i != 0) {
            System.out.println(chain.get(i));
            return printReverse(chain, i -= 1);
        } else System.out.println(chain.get(i));

        return 0;
    }
}

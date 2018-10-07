/*
Program wczytujący liczby z wejścia aż do chwili gdy podana liczba jest równa zero,
a następnie wyświetla sumę i średnią arytmetyczną tych liczb (bez zera).
*/

package core.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AmountNumbers {

    public static void main(String[] args) {
        calculate(listOfNumbers());
    }

    private static void calculate(List listOfNumbers) {
        int amount = 0;


        for (int i = 0; i < listOfNumbers.size(); i++) {
            amount += (int) listOfNumbers.get(i);
        }

        double average = (double) amount / listOfNumbers.size();

        System.out.println("Suma liczb wynosi: " + amount + "\nŚrednia liczb wynosi: " + average);
    }

    private static List listOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= numbers.size(); i++) {
            System.out.println("Podaj liczbę nr " + (i+1));
            int number = scanner.nextInt();
            if (number != 0) {
                numbers.add(number);
            } else break;
        }

        return numbers;
    }
}

package core.recursion;

import java.util.Scanner;

class CalculateStrongV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        System.out.println("Silnia podanej liczby wynosi: " + calculate(number));
    }

    /*Podając np. 3 wchodzę od razu do wiersza 21 i zaczyna działać rekurencja
    * więc wiersz 18 nie jest już wgl brany pod uwagę.
    * Podając liczbę poniżej 2 od razu wchodzę w wiersz 19*/
    private static int calculate(int number) {
        if (number < 2) {
            return 1;
        }

        return number * calculate(number - 1);
    }
}

package core.staticAndFinal;

class Main {

    public static void main(String[] args) {

        //wartość zmieni się wszędzie bo odnosi się do wszystkich obiektów
        //zmienna statyczna jest wspólna dla wszystkich obiektów w klasie
        StaticTest.VALUE = 7;

        StaticTest object1 = new StaticTest();
        object1.setFirstName("Waldek");
        object1.setLastName("Nowak");
        object1.setAge(25);

        printText(object1);

        StaticTest.VALUE = 10;

        StaticTest object2 = new StaticTest();
        object2.setFirstName("Janek");
        object2.setLastName("Kowal");
        object2.setAge(18);

        printText(object2);
        printText(object1);

        System.out.println("-------------");
        object1.test();
        object2.test();

        System.out.println("-------------");
        StaticTest.testStatic();
        //nie zalecane
        object1.testStatic();
        object2.testStatic();
    }

    private static void printText(StaticTest object) {
        System.out.println("Wynik imię: " + object.getFirstName()
                + " |nazwisko: " + object.getLastName()
                + " |wiek: " + object.getAge() + " |value: "
                + StaticTest.VALUE);
    }
}

package core.staticAndFinal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class StaticTest {

    public static Integer VALUE = 5;

    private String firstName;
    private String lastName;
    private Integer age;

    public void test() {
        System.out.println("Test: " + firstName);
    }

    public static void testStatic() {
        //nie możemy dodać firstName ponieważ metoda odwołuje się do całej klasy
        //musielibyśmy utworzyć nowy obiekt w metodzie
        System.out.println("Test static: " /*+firstName*/);
    }
}

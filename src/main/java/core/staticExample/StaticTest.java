package core.staticExample;

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
        System.out.println("Test");
    }

    public static void testStatic() {
        System.out.println("Test static");
    }
}

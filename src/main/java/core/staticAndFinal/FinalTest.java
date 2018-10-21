package core.staticAndFinal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class FinalTest {

    private String firstName;
    private final String lastName;

    public FinalTest(String lastName) {
        this.lastName = lastName;
    }

    public String testMethod() {
        return "test";
    }

    public final String testFinalMethod() {
        return "test";
    }

    public static void main(String[] args) {
        FinalTest object1 = new FinalTest("Nowak");

        object1.setFirstName("Ania");
        object1.setFirstName("Ola");

        System.out.println(object1.testMethod());
        System.out.println(object1.testFinalMethod());
    }
}

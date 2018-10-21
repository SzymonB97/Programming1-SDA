package core.staticAndFinal;

class FancyFinalTest extends FinalTest {

    public FancyFinalTest(String lastName) {
        super(lastName);
    }

    @Override
    public String testMethod() {
        return "test";
    }

    //metody final nie można nadpisać, zmienić przy dziedziczeniu
    /*@Override
    public final String testFinalMethod() {
        return "test";
    }*/

    public static void main(String[] args) {
        FancyFinalTest object1 = new FancyFinalTest("Kasia");
        System.out.println(object1.testMethod());
        System.out.println(object1.testFinalMethod());
    }
}

package Chapter6;

/**
 * Demonstrates the use of methods with variable-arity/length arguments, a.k.a. varargs, with method overloading.
 */
public class VarArgsOverloading {
    // method with no args to avoid ambiguity from empty calls:
    static void varArgsTest() {
        System.out.println("Empty");
    }

    // first version from VarsArgs class:
    static void varArgsTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        if(v.length > 0) {
            System.out.println("Contents:");
            for(int i = 0; i < v.length; i++) {
                System.out.printf("  arg %d: %d%n", i, v[i]);
            }
        }
        else {
            System.out.println("  Empty");
        }
    }
    // different version with boolean:
    static void varArgsTest(boolean ... v) {
        System.out.println("Number of args: " + v.length);
        if(v.length > 0) {
            System.out.println("Contents:");
            for(int i = 0; i < v.length; i++) {
                System.out.printf("  arg %d: %b%n", i, v[i]);
            }
        }
        else {
            System.out.println("  Empty");
        }
    }
    static void varArgsTest(String msg, int ... v) {
        System.out.printf("%s: %d%n", msg, v.length);
        if(v.length > 0) {
            System.out.printf("Contents:%n");
            for(int i = 0; i < v.length; i++) {
                System.out.printf("  arg %d: %d%n", i, v[i]);
            }
        }
        else {
            System.out.println("  Empty");
        }
    }

    // DEMO
    public static void main(String[] args) {
        varArgsTest();
        varArgsTest(42);
        varArgsTest(1,2,3);
        varArgsTest(true);
        varArgsTest(false, true, false);
        varArgsTest("Custom message", 4,5,6);
    }
}

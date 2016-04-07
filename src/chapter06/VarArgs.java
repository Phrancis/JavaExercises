package chapter06;

/**
 * Demonstrates the use of methods with variable-arity/length arguments, a.k.a. varargs.
 */
public class VarArgs {
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
    // DEMO
    public static void main(String[] args) {
        varArgsTest(42);
        varArgsTest(1,2,3);
        varArgsTest();
    }
}

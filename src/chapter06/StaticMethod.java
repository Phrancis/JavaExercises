package chapter06;

/**
 * Demonstrate the use of a static method.
 * A static member can be accessed before any object of its class are created, and without reference to any object.
 * A static method can be called with `Class.method()` notation.
 *
 * Methods declared as static have several restrictions:
 * - They can only directly call other static methods
 * - They can only directly access static data
 * - They do not have a "this" reference
 */
public class StaticMethod {
    // this can be called without instance of object:
    static int staticSum(int x, int y) {
        return x + y;
    }
    // this must be called from an instance of object:
    int nonStaticSum(int x, int y) {
        return x + y;
    }
    // DEMO
    public static void main(String[] args) {
        int x = 10, y = 15;

        // Static method is called with Class.method():
        int sum1 = StaticMethod.staticSum(x, y);
        System.out.printf("sum1: %d%n", sum1);

        // This causes an error:
        //int sum2 = StaticMethod.nonStaticSum(x, y);
        // Error: java: non-static method nonStaticSum(int,int) cannot be referenced from a static context

        // Non-static method is called with an object:
        StaticMethod obj = new StaticMethod();
        int sum2 = obj.nonStaticSum(x, y);
        System.out.printf("sum2: %d%n", sum2);
    }
}

package Chapter6;

/**
 * This class demonstrates method overloading.
 */
public class MethodOverloading {
    MethodOverloading() { }

    void overload() {
        System.out.println("No arguments.");
    }
    void overload(int a) {
        System.out.printf("1 int argument: %d%n", a);
    }
    void overload(int a, int b) {
        System.out.printf("2 int arguments: %d, %d%n", a, b);
    }
    void overload(double d) {
        System.out.printf("1 double argument: %f%n", d);
    }
    void overload(String s) {
        System.out.printf("1 string argument: %s%n", s);
    }
    void overload(MethodOverloading obj) {
        System.out.println("1 Object argument: " + obj);
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.overload();
        m.overload(42);
        m.overload(42, 99);
        m.overload(3.14159);
        m.overload("Hello");
        m.overload(m);
    }
}

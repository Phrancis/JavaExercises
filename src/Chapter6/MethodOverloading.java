package Chapter6;

/**
 * This class demonstrates method overloading, where multiple methods by the same name can be declared
 * and be used as separate methods depending on the arguments passed to it.
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
        // Certain types are converted automatically and this also applies to overloading:
        byte b = 99;
        short s = 10;
        float f = 0.99F;
        m.overload(b);  // convert to int
        m.overload(s);  // convert to int
        m.overload(f);  // convert to double
    }
}

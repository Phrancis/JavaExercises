package chapter08.Interfaces;

/**
 * Demo interface default methods.
 */
public class DefaultMethodsDemo {
    public static void main(String[] args) {
        DefaultMethodsA a = new DefaultMethodsA();
        DefaultMethodsB b = new DefaultMethodsB();

        System.out.printf("Demo DefaultMethodsA%n");
        a.implementMe();
        a.implementMeMaybe();

        System.out.printf("Demo DefaultMethodsB%n");
        b.implementMe();
        b.implementMeMaybe();

    }
}

package chapter08.Interfaces;

/**
 * Demonstrate the use of default methods in interfaces.
 * This class only implements the non-default method and the default method.
 */
public class DefaultMethodsB implements IDefaultMethods {

    @Override
    public void implementMe() {
        System.out.println("Implementation 'B' of implementMe()");
    }

    @Override
    public void implementMeMaybe() {
        System.out.println("Implementation 'B' of implementMeMaybe()");
    }
}

package chapter08.Interfaces;

/**
 * Demonstrate the use of default methods in interfaces.
 * This class only implements the non-default method only.
 */
public class DefaultMethodsA implements IDefaultMethods {

    @Override
    public void implementMe() {
        System.out.println("Implementation 'A' of implementMe()");
    }

}

package Chapter8.Interfaces;

/**
 * Demonstrate the use of default methods in interfaces.
 */
public interface IDefaultMethods {
    // this must be implemented by subclasses
    void implementMe();

    // this provides a default implementation for subclasses that don't provide their own implementation:
    default void implementMeMaybe() {
        System.out.println("Implement me... maybe...");
    }

    // this is static and doesn't need to be implemented by subclasses at all:
    static int getStaticId() {
        return 42;
    }

}
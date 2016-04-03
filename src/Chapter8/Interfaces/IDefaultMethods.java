package Chapter8.Interfaces;

/**
 * Demonstrate the use of default methods in interfaces.
 */
public interface IDefaultMethods {

    void implementMe();

    default void implementMeMaybe() {
        System.out.println("Implement me... maybe...");
    }

}
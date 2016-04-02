package Chapter7.Finality;

/**
 * Demonstrates use of a final class.
 * A final class prevents inheritance, and thus cannot also be abstract.
 * All methods in a final class are implicitly final.
 */
public final class FinalClass {
    FinalClass() {
        System.out.println("Final class cannot be inherited from.");
    }
}

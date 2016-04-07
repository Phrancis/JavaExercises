package chapter07.Finality;

/**
 * Demonstrates that final methods cannot be overridden.
 */
public class ExtendsFinalMethod extends FinalMethod {
    @Override
    void overrideMe() {
        System.out.println("Overridden.");
    }
    // This cannot be done:
    // Error:java: init() in chapter07.Finality.ExtendsFinalMethod cannot override init() in chapter07.Finality.FinalMethod
    // overridden method is final
//    @Override
//    public void init() {
//        System.out.println("Overridden.");
//    }
    // DEMO
    public static void main(String[] args) {
        ExtendsFinalMethod foo = new ExtendsFinalMethod();
        foo.overrideMe();
    }
}

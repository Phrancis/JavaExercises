package Chapter7.Finality;

/**
 * A final method cannot be overridden through inheritance. It is useful for methods that should not be
 * modified under any circumstance by subclasses.
 */
public abstract class FinalMethod {
    FinalMethod() { }

    public final void init() {
        System.out.println("init() method cannot be overridden.");
    }
    abstract void overrideMe();
}

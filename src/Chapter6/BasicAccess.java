package Chapter6;

/**
 * Basic access functionality.
 */
public class BasicAccess {
    private int alpha;  // private access
    public int beta;    // public access
    int gamma;          // default access

    // It's OK for a member of a class to access a private member of its class
    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}

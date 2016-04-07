package chapter06;

/**
 * Demonstrate basic access functionality.
 */
public class BasicAccessDemo {
    public static void main(String[] args) {
        BasicAccess obj = new BasicAccess();

        // Access to alpha is allowed only through its accessor methods:
        obj.setAlpha(-99);
        System.out.println("alpha is " + obj.getAlpha());

        // You cannot access alpha like this because alpha is private:
        //obj.alpha = 10; //Error: java: alpha has private access in chapter06.BasicAccess

        // These are OK because beta and gamma are not private:
        obj.beta = 88;
        obj.gamma = 99;
        System.out.println("beta is " + obj.beta);
        System.out.println("gamma is " + obj.gamma);
    }
}

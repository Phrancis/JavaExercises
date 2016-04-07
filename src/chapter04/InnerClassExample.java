package chapter04;

/**
 * This demo shows the usage of inner classes (also known as nested classes) in both a static and
 * non-static inner classes, as well as example usage in `main`.
 */
public class InnerClassExample {

    public static class InnerStaticClass {

        public void printSomething(String something) {
            System.out.format("InnerStaticClass.printSomething(\"%s\")%n", something);
        }
    }

    public class InnerNonStaticClass {

        public void printSomething(String somethingElse) {
            System.out.format("InnerNonStaticClass.printSomething(\"%s\")%n", somethingElse);
        }
    }

    public static void main(String[] args) {

        //Make a static object from the InnerStaticClass
        InnerClassExample.InnerStaticClass myStaticObject = new InnerClassExample.InnerStaticClass();
        myStaticObject.printSomething("Hello, World!");

        //Making a non-static object from the InnerNonStaticClass requires an instance of the outer class:
        InnerClassExample outerObject = new InnerClassExample();
        InnerClassExample.InnerNonStaticClass myNonStaticObject = outerObject.new InnerNonStaticClass();
        myNonStaticObject.printSomething("Goodbye, World!");

        //The above steps can also be combined like this:
        InnerClassExample.InnerNonStaticClass anotherNonStaticObject = new InnerClassExample().new InnerNonStaticClass();
        anotherNonStaticObject.printSomething("Foo, Bar!");
    }
}

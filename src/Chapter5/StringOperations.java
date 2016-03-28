package Chapter5;

/**
 * Demonstrate some operations that can be performed on String objects.
 */
public class StringOperations {
    // typical String declaration
    static String str1 = "Hello, World!";
    // declare String with Object syntax
    static String str2 = new String(str1);
    static String str3 = "Java strings are powerful";

    public static void main(String[] args) {
        //length()
        System.out.println("length()...");
        System.out.format("Length of str1: %d%n", str1.length());
        //charAt()
        System.out.println("charAt()...");
        for (int i = 0; i < str1.length(); i++) {
            System.out.format("char #%d: %s%n", i, str1.charAt(i));
        }

        //equals
        System.out.println("equals()...");
        if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 does not equal str2");
        }

        // greater / lesser
        System.out.println("compareTo()...");
        int result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 is equal to str3");
        } else if (result < 0) {
            System.out.println("str1 is lesser than str 3");
        } else {
            System.out.println("str1 is greater than str3");
        }

        // index of a substring
        System.out.println("indexOf()...");
        str2 = "one two three one";
        int idx = str2.indexOf("one");
        System.out.printf("First index of \"one\": %d%n", idx);
        idx = str2.lastIndexOf("one");
        System.out.printf("Last index of \"one\": %d%n", idx);

        // concatenation
        System.out.println("concatenation...");
        str1 = "One";
        str2 = "Two";
        str3 = "Three";
        String strConcat = str1 + str2 + str3;
        System.out.println("str1 + str2 + str3 = " + strConcat);
    }
}

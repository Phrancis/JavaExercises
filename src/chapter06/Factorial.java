package chapter06;

/**
 * Demonstrate recursion, i.e., a method that calls itself, with an implementation of factorial(N) or N!.
 * An iterative version is provided for comparison purposes.
 * Example:
 * 3! = 1 x 2 x 3 = 6
 */
public class Factorial {
    int factorialRecursive(int n) {
        return (n == 1)
                ? 1
                : factorialRecursive(n - 1) * n;
    }
    int factorialIterative(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // DEMO
    public static void main(String[] args) {
        Factorial f = new Factorial();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("Recursive: %d! = %d%n", i, f.factorialRecursive(i));
            System.out.printf("Iterative: %d! = %d%n", i, f.factorialIterative(i));
        }
    }
}

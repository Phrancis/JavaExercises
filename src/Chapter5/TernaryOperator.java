package Chapter5;

/**
 * The ternary or `?` operator is often used to replace if-else statements of this form:
 *      if(condition)
 *          var = expr1
 *      else
 *          var = expr2
 * The `?` is called "ternary operator" because it requires 3 operands. It takes the general form:
 *      condition ? expr1 : expr2;
 */
public class TernaryOperator {
    static void noZeroDiv() {
        int result;
        for(int i = -5; i < 6; i++) {
            // this prevents divide by zero:
            result = i != 0 ? 100 / i : 0;
            if(i != 0) {
                System.out.printf("100 / %d = %d%n", i, result);
            }
        }
    }
    static void noZeroDiv2() {
        // same as noZeroDiv but shorter logic
        for(int i = -5; i < 6; i++) {
            // this prevents divide by zero:
            if(i != 0 ? true : false) {
                System.out.printf("100 / %d = %d%n", i, 100/i);
            }
        }
    }

    public static void main(String[] args) {
        noZeroDiv();
        noZeroDiv2();
    }
}

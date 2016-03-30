package Chapter6;

/**
 * Demonstrates the use of FailSoftArray.
 */
public class FailSoftArrayDemo {
    public static void main(String[] args) {
        int errCode = -1;
        FailSoftArray fsa = new FailSoftArray(5, errCode);
        int x;

        // show quiet failures:
        System.out.println("Fail quietly...");
        for(int i = 0; i < (fsa.length * 2); i++) {
            fsa.put(i, i * 10);
        }
        for(int i = 0; i < (fsa.length * 2); i++) {
            x = fsa.get(i);
            if(x != errCode) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        // now, handle failures:
        System.out.println("Fail with error reports...");
        for(int i = 0; i < (fsa.length * 2); i++) {
            if (!fsa.put(i, i * 10)) {
                System.out.printf("Index %d out-of-bounds. %n", i);
            }
        }
        for(int i = 0; i < (fsa.length * 2); i++) {
            x = fsa.get(i);
            if(x != -1) {
                System.out.print(x + " ");
            }
            else {
                System.out.printf("%nIndex %d out-of-bounds. ", i);
            }
        }
    }
}

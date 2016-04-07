package chapter03;


import java.io.IOException;

public class GimmeABreak {

    private static void breakToExitALoop() {
        System.out.format("breakToExitALoop()%n");
        int num = 100;
        for (int i = 0; i < num; i++) {
            //break loop early:
            if (i*i >= num) {
                break;
            }
            System.out.format("%d ", i);
        }
        System.out.format("Loop complete%n");
    }
    private static void breakToExitInfiniteLoop()
        throws java.io.IOException {
        System.out.format("breakToExitInfiniteLoop()%n");
        char ch;
        for ( ; ; ) {
            System.out.format("Press q to exit loop: ");
            ch = (char) System.in.read();
            if (ch == 'q') {
                break;
            }
        }
        System.out.format("You pressed q");
    }
    private static void breakOutOfNestedLoop() {
        System.out.format("breakOutOfNestedLoop()");
        for (int i = 0; i < 3; i++) {
            System.out.format("%nOuter loop count: %d", i);
            System.out.format("%n\tInner loop count: ");
            for (int t = 0; t < 100; t++) {
                if (t == 10) {
                    break;
                }
                System.out.format("%d ", t);
            }
        }
        System.out.format("%nLoops complete%n");
    }

    /**
     * Using break with a label as a clean form of goto.
     * DO NOT ABUSE
     */
    private static void breakWithALabel() {
        System.out.format("breakWithALabel()%n");
        for (int i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.format("i is %d%n", i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        //This is never reached:
                        System.out.format("This is never reached");
                    }
                    System.out.format("After block three%n");
                }
                System.out.format("After block two%n");
            }
            System.out.format("After block one%n");
        }
        System.out.format("After `for`%n");
    }

    public static void breakWithALabel2() {
        System.out.format("breakWithALabel2()%n");
        done: for (int i = 0; i < 10; i++) {
            System.out.format("i%d ", i);
            for (int j = 0; j < 10; j++) {
                System.out.format("j%d ", j);
                for (int k = 0; k < 10; k++) {
                    System.out.format("k%d ", k);
                    if (k == 5) {
                        break done;
                    }
                }
                System.out.format("After k loop (won't execute)");
            }
            System.out.format("After j loop (won't execute)");
        }
        System.out.format("%nAfter i loop");
    }
    private static void continueWithACondition() {
        System.out.format("continueWithACondition()%n");
        for (int i = 0; i < 100; i++) {
            //Continue (back to outer loop) only if number is NOT even:
            if (i % 2 != 0) {
                continue;
            }
            System.out.format("%d ", i);
        }
    }
    private static void continueWithALabel() {
        System.out.format("continueWithALabel()%n");
        outerLoop: for (int i = 0; i < 10; i++) {
            System.out.format("%nOuter loop #%d | Inner loop ", i);
            for (int j = 0; j< 10; j++) {
                System.out.format("%d ", j);
                if (j == 4) {
                    continue outerLoop;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.format("GimmeABreak%n");
        breakToExitALoop();
//        try {
//            breakToExitInfiniteLoop();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        breakOutOfNestedLoop();
        breakWithALabel();
        breakWithALabel2();
        continueWithACondition();
        continueWithALabel();
    }
}

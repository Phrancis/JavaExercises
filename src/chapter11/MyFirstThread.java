package chapter11;

/**
 * Simple demonstration of a thread.
 */
public class MyFirstThread implements Runnable {
    private Thread thread;

    MyFirstThread(String threadName) {
        thread = new Thread(this, threadName);
    }

    /**
     * The general contract of the method run is that it may take any action whatsoever.
     * Ref: https://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html
     * An indentation is left in the print statements to differentiate it from the `main` thread's prints.
     */
    public void run() {
        // marker for start of thread
        System.out.printf("  %s starting%n", thread.getName());

        // do something; this could be anything...
        printAndWait(15, 300);

        // marker for end of thread
        System.out.printf("  %s ending%n", thread.getName());
    }

    /**
     * Print numbers to stdout with a delay.
     * An indentation is left in the print statements to differentiate it from the `main` thread's prints.
     * @param howMany the amount of number to print
     * @param waitMs the delay between printing numbers
     */
    void printAndWait(int howMany, int waitMs) {
        try {
            for(int i = 0; i < howMany; i++) {
                Thread.sleep(waitMs);
                System.out.printf("  %s i = %d%n", thread.getName(), i);
            }
        } catch(InterruptedException exc) {
            System.out.printf("  %s interrupted%n", thread.getName());
        }
    }

    // DEMO
    public static void main(String[] args) {
        System.out.println("main thread starting");

        /**
         * This constructs an object, then a thread from it (from Runnable interface).
         * It then starts the thread, which runs independently from `main`.
         */
        MyFirstThread threadObj = new MyFirstThread("child");
        Thread thread = new Thread(threadObj);
        thread.start();

        /**
         * Separate, independent thread `main`, also printing numbers.
         * Notice in stdout how the 2 processes run independently of each other.
         */
        for(int i = 0; i < 50; i++) {
            System.out.printf("main i = %d%n", i);
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("main thread interrupted.");
            }
        }
        System.out.println("main thread ending");
    }
}

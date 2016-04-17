package chapter11;

/**
 * Simple use of a thread.
 * NOTE:
 */
public class MyFirstThread implements Runnable {
    private String threadName;

    private MyFirstThread(String threadName) {
        this.threadName = threadName;
    }

    /**
     *
     */
    public void run() {
        System.out.printf("  %s starting%n", threadName);
        // do something; this could be anything...
        printAndWait(10, 400);
        System.out.printf("  %s ending%n", threadName);
    }

    /**
     * Print numbers to stdout with a delay.
     * @param howMany the amount of number to print
     * @param waitMs the delay between printing numbers
     */
    private void printAndWait(int howMany, int waitMs) {
        try {
            for(int i = 0; i < howMany; i++) {
                Thread.sleep(waitMs);
                System.out.printf("  %s i = %d%n", threadName, i);
            }
        } catch(InterruptedException exc) {
            System.out.printf("  %s interrupted%n", threadName);
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
         * Separate, independent thread `main`, printing numbers.
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

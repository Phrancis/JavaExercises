package chapter11;

/**
 * Another way of using threads, by extending the Thread class.
 */
public class ExtendThread extends Thread {
    private ExtendThread(String threadName) {
        super(threadName);
    }
    public void run() {
        System.out.printf("  %s starting%n", getName());

        // Re-use the utility method
        MyFirstThread mft = new MyFirstThread(getName());
        mft.printAndWait(15, 300);

        System.out.printf("  %s terminating%n", getName());
    }

    // DEMO
    public static void main(String[] args) {
        System.out.println("main thread starting");
        ExtendThread extendThread = new ExtendThread("child");
        extendThread.start();
        for(int i = 0; i < 50; i++) {
            System.out.printf("main i = %d%n", i);
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("main interrupted");
            }
        }
        System.out.println("main thread ending");
    }
}

package chapter11;

/**
 * Companion to ThreadIsAlive class
 * Demonstrate use of Thread.join() method to check whether a thread is still running.
 */
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // create 3 running threads
        // using different sleep times to illustrate
        NumLoopThread t1 = new NumLoopThread("t1", 400);
        NumLoopThread t2 = new NumLoopThread("t2", 375);
        NumLoopThread t3 = new NumLoopThread("t3", 450);

        try {
            t1.thread.join();
            System.out.printf("%s joined%n", t1.getThreadName());
            t2.thread.join();
            System.out.printf("%s joined%n", t2.getThreadName());
            t3.thread.join();
            System.out.printf("%s joined%n", t3.getThreadName());
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}

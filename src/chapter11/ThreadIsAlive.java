package chapter11;

/**
 * Demonstrate use of Thread.isAlive() method to check whether a thread is still running.
 */
public class ThreadIsAlive {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // create 3 running threads
        MultipleThreads t1 = new MultipleThreads("t1");
        MultipleThreads t2 = new MultipleThreads("t2");
        MultipleThreads t3 = new MultipleThreads("t3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        //wait until all threads terminate:
        } while (t1.thread.isAlive() ||
                 t2.thread.isAlive() ||
                 t3.thread.isAlive());
        System.out.println("Main thread ending");
    }
}

package chapter11;

/**
 * Companion to JoinThreads class
 * Demonstrate use of Thread.isAlive() method to check whether a thread is still running.
 */
public class ThreadIsAlive {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        /* create 3 running threads */
        NumLoopThread t1 = new NumLoopThread("t1");
        NumLoopThread t2 = new NumLoopThread("t2");
        NumLoopThread t3 = new NumLoopThread("t3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        /* wait until all threads terminate: */
        } while (t1.thread.isAlive() ||
                 t2.thread.isAlive() ||
                 t3.thread.isAlive());
        System.out.println("Main thread ending");
    }
}

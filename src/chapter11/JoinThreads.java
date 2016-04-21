package chapter11;

/**
 * Companion to ThreadIsAlive class
 * Demonstrate use of Thread.isAlive() method to check whether a thread is still running.
 */
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // create 3 running threads
        NumLoopThread t1 = new NumLoopThread("t1", 400);
        NumLoopThread t2 = new NumLoopThread("t2", 400);
        NumLoopThread t3 = new NumLoopThread("t3", 400);
    }
}

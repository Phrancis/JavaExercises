package chapter11.SuspendResumeStop;

/**
 * Run SuspendResumeStopThread
 */
public class RunSuspendResumeStopThread {
    public static void main(String[] args) {
        SuspendResumeStopThread thread1 = new SuspendResumeStopThread("thread1");

        try {
            Thread.sleep(1000); // let thread1 start executing

            thread1.suspendThread();
            System.out.printf("Suspending thread%n");
            Thread.sleep(1000);

            thread1.resumeThread();
            System.out.printf("Resuming thread%n");
            Thread.sleep(1000);

            thread1.suspendThread();
            System.out.printf("Suspending thread%n");
            Thread.sleep(1000);

            thread1.resumeThread();
            System.out.printf("Resuming thread%n");
            Thread.sleep(1000);

            thread1.suspendThread();
            System.out.printf("Stopping thread%n");
            thread1.stopThread();

        }
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }

        // wait for thread to finish
        try {
            thread1.thread.join();
        }
        catch(InterruptedException exc) {
            exc.printStackTrace();
        }

        System.out.printf("Main thread exiting%n");
    }
}

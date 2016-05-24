package chapter11.UseMain;

/**
 * Try This 11-2
 * Controlling the main thread
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thread;

        // get the main thread:
        thread = Thread.currentThread();

        // display the thread's name:
        System.out.printf("main thread is called: \"%s\"%n", thread.getName());

        // display the main thread's priority:
        System.out.printf("Priority: %s%n", thread.getPriority());

        System.out.println();

        // set the name and priority:
        System.out.println("Setting thread name and priority...");
        thread.setName("thread #1");
        thread.setPriority(Thread.NORM_PRIORITY + 3);

        // display results:
        System.out.printf("main thread is now called: \"%s\"%n", thread.getName());
        System.out.printf("Priority is now: %d%n", thread.getPriority());
    }
}

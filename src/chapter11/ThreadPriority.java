package chapter11;

/**
 * Demonstrate thread priority.
 */
public class ThreadPriority implements Runnable {
    private int count;
    private Thread thread;
    private static boolean stop = false;
    private static String currentName;

    private ThreadPriority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.printf("%s starting%n", thread.getName());
        do {
            count++;
            if(currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                // print statement to occupy thread
                System.out.printf("In %s%n", currentName);
            }
        } while(!stop && count < 10000000);
        stop = true;
        System.out.printf("%n%s terminating%n", thread.getName());
    }
    // DEMO
    public static void main(String[] args) {
        ThreadPriority hiPr = new ThreadPriority("HIGH PRIORITY");
        ThreadPriority loPr = new ThreadPriority("Low Priority");

        //set priorities:
        hiPr.thread.setPriority(Thread.NORM_PRIORITY + 2);
        loPr.thread.setPriority(Thread.NORM_PRIORITY - 2);

        //start the threads:
        hiPr.thread.start();
        loPr.thread.start();

        try {
            hiPr.thread.join();
            loPr.thread.join();
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.printf("%n%s thread counted to %d", hiPr.thread.getName(), hiPr.count);
        System.out.printf("%n%s thread counted to %d", loPr.thread.getName(), loPr.count);
    }
}

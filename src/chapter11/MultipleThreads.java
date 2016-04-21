package chapter11;

import java.lang.Thread;

/**
 * Programs can create as many child threads as they need. This program creates 3 child threads.
 */
public class MultipleThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // Build 3 separate threads
        NumLoopThread t1 = new NumLoopThread("t1", 400);
        NumLoopThread t2 = new NumLoopThread("t2", 400);
        NumLoopThread t3 = new NumLoopThread("t3", 400);

        for(int i = 0; i <50; i++) {
            System.out.printf(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        System.out.println("Main thread ending");
    }
}

package chapter11;

import java.lang.Thread;

/**
 * Programs can create as many child threads as they need. This program creates 3 child threads.
 */
public class MultipleThreads implements Runnable {
    private String name;

    private MultipleThreads(String name) {
        this.name = name;
        Thread thread = new Thread(this, this.name);
        thread.start();
    }
    /** Begin execution of new thread: */
    public void run() {
        System.out.printf(" %s starting%n", name);
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.printf("    %s, i = %d%n", name, i);
            }
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.printf("  %s ending", name);
    }

    // Demo
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // Build 3 separate threads
        MultipleThreads t1 = new MultipleThreads("Child1");
        MultipleThreads t2 = new MultipleThreads("Child2");
        MultipleThreads t3 = new MultipleThreads("Child3");

        for(int i = 0; i <50; i++) {
            System.out.printf("main i = %d%n", i);
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        System.out.println("Main thread ending");
    }
}

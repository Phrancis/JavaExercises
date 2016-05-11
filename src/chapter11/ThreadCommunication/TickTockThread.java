package chapter11.ThreadCommunication;

/**
 * Thread for TickTockClock
 */
class TickTockThread implements Runnable {
    Thread thread;
    private TickTockClock clock;

    TickTockThread(String name, TickTockClock clock) {
        this.thread = new Thread(this, name);
        this.clock = clock;
        thread.start();
    }

    public void run() {
        if(thread.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) {
                clock.tick(true);
            }
            clock.tick(false);
        }
        else {
            for(int i = 0; i < 5; i++) {
                clock.tock(true);
            }
            clock.tock(false);
        }
    }
}

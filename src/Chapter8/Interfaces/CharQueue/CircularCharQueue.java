package Chapter8.Interfaces.CharQueue;

/**
 * A queue whose indexes can be reused by "looping" around, if it is not full.
 */
public class CircularCharQueue implements ICharQueue {
    private char[] queue;
    private int putIx;
    private int getIx;

    CircularCharQueue(int size) {
        this.queue = new char[size + 1];
        this.putIx = this.getIx = 0;
    }

    @Override
    public void put(char ch) {
        if(putIx == getIx - 1 | (putIx == queue.length - 1 & getIx == 0)) {
            System.out.println("Queue is full.");
            return;
        }
        queue[putIx++] = ch;
        if(putIx == queue.length) {
            putIx = 0;  // loop back
        }
    }

    @Override
    public char get() {
        if(getIx == putIx) {
            System.out.println("Queue is empty.");
            return (char) 0;
        }
        char ch = queue[getIx++];
        if(getIx == queue.length) {
            getIx = 0;  // loop back
        }
        return ch;
    }
}

package Chapter8.Interfaces.CharQueue;

/**
 * Implements ICharQueue.
 */
public class CharQueue implements ICharQueue {
    private char[] queue;
    private int getIx;
    private int putIx;

    CharQueue(int size) {
        this.queue = new char[size];
        this.getIx = 0;
        this.putIx = 0;
    }

    /**
     * Put a character into the queue.
     * @param ch the character to put into the queue
     */
    @Override
    public void put(char ch) {
        if(putIx < queue.length) {
            queue[putIx] = ch;
            putIx += 1;
        }
        else {
            System.out.println("Queue is full; cannot put new items in it.");
        }
    }

    /**
     * Get a character from the queue.
     * @return the index to get a character from
     */
    @Override
    public char get() {
        char ret;
        if(getIx < putIx && getIx < queue.length) {
            ret = queue[getIx];
            getIx += 1;
        }
        else {
            ret = (char) 0;
            System.out.println("Queue is empty; cannot get more items from it.");
        }
        return ret;
    }
}

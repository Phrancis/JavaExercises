package Chapter5;

/**
 * Try This 5-2
 * This class implements a non-circular queue using an array. A queue is First In, First Out (FIFO),
 * and non-circular means the queue can become exhausted.
 */
public class QueueNonCircular {
    // This array holds the queue:
    char[] queue;
    // The put and get indices:
    int putIx;
    int getIx;

    /**
     * Constructor.
     * @param size the maximum size of the queue.
     */
    public QueueNonCircular(int size) {
        // Allocate memory for the queue:
        queue = new char[size];
        putIx = getIx = 0;
    }

    /**
     * Puts a char at the current `put` index, and increments to the next index.
     * @param ch the char to put at the index.
     */
    void put(char ch) {
        if(putIx == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        queue[putIx++] = ch;
    }

    /**
     * Gets the char at the current `get` index, and increments to the next index.
     * @return the char at the current index.
     */
    char get() {
        if(getIx == putIx) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return queue[getIx++];
    }
}

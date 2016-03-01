package Chapter5;

import junit.framework.TestCase;

/**
 * Unit tests for FiniteArrayQueue.
 */
public class FiniteArrayQueueTest extends TestCase {
    private static final int CAPACITY = 4;
    private Queue testQueue;

    public FiniteArrayQueueTest(String testName) {
        super(testName);
        testQueue = new FiniteArrayQueue(CAPACITY);
    }

    public void testIsEmpty() throws Exception {
        assertTrue(testQueue.isEmpty());
    }
    public void testNotIsEmpty() throws Exception {
        testQueue.enqueue("Hello");
        assertFalse(testQueue.isEmpty());
    }
    public void testIsFull() throws Exception {
        for(int i = 0; i < CAPACITY; i++) {
            testQueue.enqueue(i);
        }
        assertTrue(testQueue.isFull());
    }
    public void testNotIsFull() throws Exception {
        for(int i = 0; i < 2; i++) {
            testQueue.enqueue(i);
        }
        assertFalse(testQueue.isFull());
    }
    public void testGetSize() throws Exception {
        for(int i = 0; i < 3; i++) {
            testQueue.enqueue(i);
        }
        assertEquals(testQueue.getSize(), 3);
    }
    public void testEnqueue() throws Exception {
        assertTrue(testQueue.isEmpty());
        testQueue.enqueue("A");
        assertEquals(testQueue.getSize(), 1);
    }
    public void testDequeue() throws Exception {
        testQueue.enqueue("Foo");
        assertSame(testQueue.dequeue(), "Foo");
        assertTrue(testQueue.isEmpty());
    }
}
package Chapter5;

import junit.framework.TestCase;

/**
 * Unit tests for FiniteArrayQueue.
 */
public class FiniteArrayQueueTest extends TestCase {

    public FiniteArrayQueueTest(String testName) {
        super(testName);
    }

    public void testGetQueue() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(2);
        assertNotNull(testQueue.getQueue());
        assertTrue(testQueue.getQueue() instanceof Object[]);
    }
    public void testGetCapacity() throws Exception {
        FiniteArrayQueue testQueue_0 = new FiniteArrayQueue(0);
        assertEquals(0, testQueue_0.getCapacity());
        FiniteArrayQueue testQueue_1 = new FiniteArrayQueue(1);
        assertEquals(1, testQueue_1.getCapacity());
        FiniteArrayQueue testQueue_2 = new FiniteArrayQueue(2);
        assertEquals(2, testQueue_2.getCapacity());
        FiniteArrayQueue testQueue_999999 = new FiniteArrayQueue((999999));
        assertEquals(999999, testQueue_999999.getCapacity());
    }
    public void testCapacityLessThanZeroBecomesZero() throws Exception {
        FiniteArrayQueue testQueue_n1 = new FiniteArrayQueue(-1);
        assertEquals(0, testQueue_n1.getCapacity());
        FiniteArrayQueue testQueue_n99999 = new FiniteArrayQueue(-99999);
        assertEquals(0, testQueue_n99999.getCapacity());
    }
    public void testGetTailNoWrapAround() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(3);
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            assertEquals(i, testQueue.getTail());
            testQueue.enqueue("foo");
        }
    }
    public void testGetTailWithWrapAround() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(3);
        //fill in array completely:
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            testQueue.enqueue("foo");
        }
        //dequeue and enqueue to "wrap around" the array indexes:
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            testQueue.dequeue();
            testQueue.enqueue("foo");
            assertEquals(i, testQueue.getTail());
        }
    }
    public void testGetHeadNoWrapAround() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(3);
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            testQueue.enqueue("foo");
        }
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            assertEquals(i, testQueue.getHead());
            testQueue.dequeue();
        }
    }
    public void testGetHeadWithWrapAround() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(3);
        //fill in array completely:
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            testQueue.enqueue("foo");
        }
        //dequeue and enqueue to "wrap around" the array indexes:
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            testQueue.dequeue();
            testQueue.enqueue("foo");
        }
        assertEquals(3, testQueue.getHead());
        //dequeue again to test that the head is at the right index after wrapping around:
        for(int i = 0; i < testQueue.getCapacity(); i++) {
            testQueue.dequeue();
            assertEquals(i, testQueue.getHead());
        }
    }
    public void testPeekAtTailIsNullUponInstantiation() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(2);
        assertNull(testQueue.peekAtTail());
    }
    public void testPeekAtHeadIsNullUponInstantiation() throws Exception {
        FiniteArrayQueue testQueue = new FiniteArrayQueue(2);
        assertNull(testQueue.peekAtHead());
    }

//    public void testPeekAtTailHasCorrectValue() throws Exception {
//        FiniteArrayQueue testQueue = new FiniteArrayQueue(3);
//        for(int i = 0; i < 3; i++) {
//            testQueue.enqueue(i);
//            assertEquals(i, testQueue.peekAtTail()); //junit.framework.AssertionFailedError: expected:<1> but was:<0>
//        }
//    }
    public void testIsEmptyUponInstantiation() throws Exception {
        Queue testQueue = new FiniteArrayQueue(2);
        assertTrue(testQueue.isEmpty());
    }

//    public void testPeekAtTail() throws Exception {
//        testQueue = new FiniteArrayQueue(2);
//        Object obj = testQueue.peekAtTail();
//    }

    public void testIsEmpty() throws Exception {

    }

    public void testIsFull() throws Exception {

    }

    public void testGetSize() throws Exception {

    }

    public void testEnqueue() throws Exception {

    }

    public void testDequeue() throws Exception {

    }


//    public void testGetQueue() throws Exception {
//
//    }
//
//    public void testGetCapacity() throws Exception {
//
//    }
//
//    public void testGetHead() throws Exception {
//
//    }
//
//    public void testGetTail() throws Exception {
//
//    }
    public void testNotIsEmpty() throws Exception {
        Queue testQueue = new FiniteArrayQueue(2);
        testQueue.enqueue("Hello");
        assertFalse(testQueue.isEmpty());
    }
//    public void testIsFull() throws Exception {
//        for(int i = 0; i < 3; i++) {
//            testQueue.enqueue(i);
//        }
//        assertTrue(testQueue.isFull());
//    }
//    public void testNotIsFull() throws Exception {
//        for(int i = 0; i < 2; i++) {
//            testQueue.enqueue(i);
//        }
//        assertFalse(testQueue.isFull());
//    }
//    public void testGetSize() throws Exception {
//        for(int i = 0; i < 3; i++) {
//            testQueue.enqueue(i);
//        }
//        assertEquals(testQueue.getSize(), 3);
//    }
//    public void testEnqueue() throws Exception {
//        testQueue.enqueue("A");
//        assertEquals(testQueue.getSize(), 1);
//    }
//    public void testDequeue() throws Exception {
//        testQueue.enqueue("Foo");
//        assertSame(testQueue.dequeue(), "Foo");
//    }
//    public void testGetSizeWithWrapAround() throws Exception {
//        for(int i = 0; i < 3; i++) {
//            testQueue.enqueue(i);
//        }
//        for(int i = 0; i < 3; i++) {
//            testQueue.dequeue();
//        }
//        assertEquals(testQueue.getSize(), 1);
//        testQueue.enqueue(4);
//        assertEquals(testQueue.getSize(), 2);
//        testQueue.enqueue(5);
//        assertEquals(testQueue.getSize(), 3);
//        testQueue.enqueue(6);
//        assertEquals(testQueue.getSize(), 4);
//    }
}
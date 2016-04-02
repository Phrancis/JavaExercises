package Chapter8.Interfaces.CharQueue;

/**
 * Demonstrate use of CharQueue.
 */
public class CharQueueDemo {
    public static void main(String[] args) {
        CharQueue q = new CharQueue(5);
        for(int i = 0; i < 5; i++) {
            q.put((char) ('A' + i));
        }
        q.put('Z');
        for(int i = 0; i < 5; i++) {
            System.out.println(q.get());
        }
        q.get();
    }
}

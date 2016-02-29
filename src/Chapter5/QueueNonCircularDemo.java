package Chapter5;

/**
 * Demo of QueueNonCircular class.
 */
public class QueueNonCircularDemo {
    public static void main(String[] args) {
        System.out.println("QueueNonCircularDemo");
        QueueNonCircular bigQ = new QueueNonCircular(100);
        QueueNonCircular smallQ = new QueueNonCircular(4);
        char ch;

        // put alphabet into bigQ:
        System.out.println("Using bigQ to store the alphabet.");
        for(int i = 0; i < 26; i++) {
            ch = (char) ('A' + i);
            bigQ.put(ch);
        }
        // get contents from bigQ:
        System.out.format("Contents of bigQ : ");
        for(int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println();

        System.out.println("Using smallQ to generate errors");
        // this will result in `Queue is full` message on last iteration:
        for(int i = 0; i < 5; i++) {
            ch = (char) ('Z' - i);
            System.out.format("Attempting to store %s at index %d", ch, i);
            smallQ.put(ch);
            System.out.println();
        }
        System.out.println();
        // get contents from smallQ (this will result in `Queue is empty` on last iteration):
        System.out.format("Contents of smallQ : ");
        for (int i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}

package Chapter8.Interfaces.CharQueue;

/**
 * Demonstrate use of ICharQueue and various implementations.
 */
public class CharQueueDemo {
    public static void main(String[] args) {
        FixedCharQueue fixedQ = new FixedCharQueue(10);
        DynamicCharQueue dynQ = new DynamicCharQueue(5);
        CircularCharQueue circQ = new CircularCharQueue(10);
        ICharQueue iQ;

        char ch;
        int i;

        iQ = fixedQ;
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("Contents of fixed queue:");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = dynQ;
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("Contents of dynamic queue:");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = circQ;
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("Contents of circular queue:");
        for(i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Store and consume from circular queue:");
        for(i = 0; i < 26; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}

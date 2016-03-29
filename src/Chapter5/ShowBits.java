package Chapter5;

/**
 * "Try this 5-3" Continuation of BitwiseOperators class.
 * Showbits enablesto display in binary the bit pattern for any integer value. This can be a benefit to be able
 * to monitor the data stream for certain types of code, such as device driver code.
 */
public class ShowBits {
    private int numBits;

    ShowBits(int numBits) {
        this.numBits = numBits;
    }

    private void show(long val) {
        long mask = 1;

        // left shift a 1 into the proper position:
        mask <<= numBits - 1;

        int spacer = 0;
        for( ; mask != 0; mask >>>= 1) {
            printBit(val, mask);
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }

    // Utility:
    static void printBit(long val, long t) {
        if((val & t) != 0) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }

    // Demonstrate:
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 in binary: ");
        b.show(123);
        //01111011
        System.out.println("87987 in binary: ");
        i.show(87987);
        //00000000 00000001 01010111 10110011
        System.out.println("237658768 in binary: ");
        li.show(237658768);
        //00000000 00000000 00000000 00000000 00001110 00101010 01100010 10010000

        // Show low order bits of any integer:
        System.out.println("Low order bits of 87987 in binary: ");
        b.show(87987);
    }
}

package Chapter5;

/**
 * Bitwise operators are used to test, set or shift the individual bits that make up a value.
 * They can be used on types: long, int, short, char, byte
 * They cannot be used on types: boolean, float, double
 * The bitwise operators are:
 *      &   : bitwise AND
 *      |   : bitwise OR
 *      ^   : bitwise exclusive OR
 *      >>  : shift right
 *      >>> : unsigned shift right
 *      <<  : shift left
 *      ~   : one's complement (unary NOT)
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        bitwiseAND1();
        bitwiseAND2();
        bitwiseOR();
        bitwiseXOR();
    }

    static void bitwiseAND1() {
        /**
         * Uppercase letters
         * The value 65503 is the decimal representation of 1111 1111 1101 1111
         * Thus the AND operator leaves all bits in `ch` unchanged, except the 6th one which is set to 0.
         */
        System.out.println("Uppercase letters using bitwise AND...");
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            // this statement turns off the 6th bit
            ch = (char) ((int) ch & 65503); // ch is now uppercase
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    static void bitwiseAND2() {
        /**
         * The AND operator is useful when you want to determine whether a bit is ON or OFF
         * For example, this statement determine whether bit 4 in `status` is set:
         * if ((status & 8) != 0) { System.out.println("Bit 4 is ON"); }
         */
        System.out.println("Test each bit to see whether it is on or off...");
        int t;
        byte val = 123;
        for (t = 128; t > 0; t /= 2) {
            if ((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
    }

    static void bitwiseOR() {
        /**
         * Lowercase letters
         * The value 32 is the decimal representation of 0000 0000 0010 0000
         * Thus the OR operator leaves all bits in `ch` unchanged, except the 6th one which is set to 1.
         */
        System.out.println("Lowercase letters using bitwise OR...");
        char ch;
        for(int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            // This statement turn on the 6th bit:
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    static void bitwiseXOR() {
        /**
         * The XOR operator has an interesting property that makes it a simple way to encode a message.
         * When some value X is XORed with another value Y, and then that result is XORed with Y again, X is produced
         * That is, given the sequence
         *      R1 = X ^ Y; R2 = R1 ^ Y;
         * then R2 is the same value as X. Thus the outcome of a sequence of two XORs can produce the original value.
         */
        System.out.println("Use XOR to encode and decode a message...");
        String msg = "I haz a seekrit!";
        String encMsg = "";
        String decMsg = "";
        int key = 84;
        System.out.println("Original message: " + msg);

        //this encodes the message:
        for(int i = 0; i < msg.length(); i++) {
            encMsg = encMsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("Encoded message: " + encMsg);

        //this decodes the messageL
        for(int i = 0; i < msg.length(); i++) {
            decMsg = decMsg + (char) (encMsg.charAt(i) ^ key);
        }
        System.out.println("Decoded message: " + decMsg);
    }
}

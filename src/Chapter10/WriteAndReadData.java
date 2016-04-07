package chapter10;

import java.io.*;

/**
 * Write then read back binary data.
 */
public class WriteAndReadData {
    static int i = 42;
    static double d = 3.14159;
    static boolean b = true;

    public static void writeData() {
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);
            System.out.println("Writing " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);
        }
        catch (IOException exc) {
            System.out.println(exc);
        }
    }
    public static void readData() {
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();

        }
        catch (IOException exc){
            System.out.println(exc);
        }
    }
    // DEMO
    public static void main(String[] args) {
        WriteAndReadData.writeData();
    }
}

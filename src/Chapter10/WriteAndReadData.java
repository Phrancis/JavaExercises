package chapter10;

import java.io.*;

/**
 * Write then read back binary data.
 */
public class WriteAndReadData {

    private void writeData() {
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("D:/Downloads/testdata.txt"))) {
            int i = 42;
            double d = 3.14159;
            boolean b = true;
            System.out.println("Writing " + i);
            dataOut.writeInt(i);
            System.out.println("Writing " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    private void readData() {
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("D:/Downloads/testdata.txt"))) {
            int i = dataIn.readInt();
            System.out.printf("Read: %d%n", i);
            double d = dataIn.readDouble();
            System.out.printf("Read: %f%n", d);
            boolean b = dataIn.readBoolean();
            System.out.printf("Read: %s%n", b);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
    }
    // DEMO
    public static void main(String[] args) {
        WriteAndReadData wr = new WriteAndReadData();
        wr.writeData();
        wr.readData();
    }
}

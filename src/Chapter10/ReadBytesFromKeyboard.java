package Chapter10;

import java.io.*;

/**
 * Demonstrate reading an array of bytes from keyboard.
 */
public class ReadBytesFromKeyboard {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[100];
        System.out.print("Enter some characters: ");
        // Read an array of bytes from the keyboard:
        System.in.read(data);
        System.out.print("You entered: ");
        for(byte b : data) {
            System.out.print((char) b);
        }
    }
}

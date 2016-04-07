package chapter10;

import java.io.*;

/**
 * Demonstrates displaying a text file.
 * This, unlike ShowFile1 and ShowFile2, uses try-with-resources from JDK 7 to automatically close the file.
 */
public class ShowFile3 {
    public static void showFile(String filePath) {
        int i;

        // This code uses try-with-resources to open a file
        // and then automatically closes it when the try block is left:
        try (FileInputStream fileIn = new FileInputStream(filePath)){
            // Open file if it exists:
            final int EOF = -1;
            // Read bytes until EOF is encountered:
            do {
                i = fileIn.read();
                if(i != EOF) {
                    System.out.print((char) i);
                }
            } while (i != EOF);
            System.out.println();
        }
        catch(FileNotFoundException exc) {
            System.out.println("File not found");
        }
        catch(IOException exc) {
            System.out.println("Error reading file");
        }
        // No need for a finally block to close the file
    }
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/francisveilleux-gaboury/Documents/demo.txt";
        ShowFile3.showFile(filePath);
    }
}

package Chapter10;

import java.io.*;

/**
 * Demonstrates displaying a text file.
 * This opens and reads the file in separate blocks.
 */
public class ShowFile1 {
    public static void showFile(String filePath) {
        int i;
        FileInputStream fileIn = null;

        // Open file if it exists:
        try {
            fileIn = new FileInputStream(filePath);
        } catch(FileNotFoundException | NullPointerException exc) {
            System.out.println("Error opening file");
        }
        // Read bytes until EOF is encountered:
        try {
            final int EOF = -1;
            do {
                i = fileIn.read();
                if(i != EOF) {
                    System.out.print((char) i);
                }
            } while (i != EOF);
            System.out.println();
        }
        catch(IOException | NullPointerException exc) {
            System.out.println("Error reading file");
        }
        finally {
            // Close the file
            try {
                fileIn.close();
            } catch (IOException | NullPointerException exc) {
                System.out.println("Error closing file");
            }
        }

    }
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/francisveilleux-gaboury/Documents/demo.txt";
        ShowFile1.showFile(filePath);
    }
}

package Chapter10;

import java.io.*;

/**
 * Demonstrates displaying a text file.
 * This, unlike ShowFile1, open and reads file in same block.
 */
public class ShowFile2 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fileIn = null;
        String filePath = "/Users/francisveilleux-gaboury/Documents/demo.txt";

        try {
            // Open file if it exists:
            fileIn = new FileInputStream(filePath);
            final int EOF = -1;
            // Read bytes until EOF is encountered:
            do {
                i = fileIn.read();
                if(i != EOF) {
                    System.out.print((char) i);
                }
            } while (i != EOF);
        }
        catch(FileNotFoundException exc) {
            System.out.println("File not found");
        }
        catch(IOException exc) {
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
}

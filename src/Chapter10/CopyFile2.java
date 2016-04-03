package Chapter10;

import java.io.*;

/**
 * Demonstrates copying a text file to another.
 * This version, unlike CopyFile1, uses try-with-resources to automatically close to streams when exiting try block.
 */
public class CopyFile2 {
    public static void copyFile(String sourceFilePath, String destFilePath) {
        int i;
        final int EOF = -1;

        // Open both streams:
        try (FileInputStream fileIn = new FileInputStream(sourceFilePath);
             FileOutputStream fileOut = new FileOutputStream(destFilePath)){
            // Copy bytes from source to dest:
            do {
                i = fileIn.read();
                if(i != EOF) {
                    fileOut.write(i);
                }
            } while(i != EOF);
        }
        catch(IOException | NullPointerException exc) {
            System.out.println(exc);
        }
    }
    public static void main(String[] args) {
        String sourceFilePath = "/Users/francisveilleux-gaboury/Documents/demo.txt";
        String destFilePath = "/Users/francisveilleux-gaboury/Documents/demo2.txt";
        CopyFile1.copyFile(sourceFilePath, destFilePath);
        // Show both files are the same:
        System.out.println("Source file:");
        ShowFile3.showFile(sourceFilePath);
        System.out.println("Destination file:");
        ShowFile3.showFile(destFilePath);
    }
}

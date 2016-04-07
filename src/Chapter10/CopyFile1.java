package chapter10;

import java.io.*;

/**
 * Demonstrates copying a text file to another.
 */
public class CopyFile1 {
    public static void copyFile(String sourceFilePath, String destFilePath) {
        int i;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        final int EOF = -1;
        try {
            // Open both streams:
            fileIn = new FileInputStream(sourceFilePath);
            fileOut = new FileOutputStream(destFilePath);
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
        finally {
            // Close both streams:
            try {
                if(fileIn != null) {
                    fileIn.close();
                }
            } catch(IOException | NullPointerException exc) {
                System.out.println("Could not close file");
            }
            try {
                if(fileOut != null) {
                    fileOut.close();
                }
            } catch(IOException | NullPointerException exc) {
                System.out.println("Could not close file");
            }
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

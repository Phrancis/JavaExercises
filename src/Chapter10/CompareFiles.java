package chapter10;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Try This 10-1: A file comparison utility
 */
public class CompareFiles {
    public static void compareFiles(String file1, String file2) {
        int ix1 = 0, ix2 = 0;
        try(FileInputStream fileIn1 = new FileInputStream(file1);
            FileInputStream fileIn2 = new FileInputStream(file2))
        {
            do {
                ix1 = fileIn1.read();
                ix2 = fileIn2.read();
                if(ix1 != ix2) {
                    break;
                }
            } while (ix1 != -1 && ix2 != -1);
            if(ix1 != ix2) {
                System.out.println("Files are different.");
            }
            else {
                System.out.println("Files are the same.");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    // DEMO
    public static void main(String[] args) {
        String file1 = "/Users/francisveilleux-gaboury/Documents/demo.txt";
        String file2 = "/Users/francisveilleux-gaboury/Documents/demo2.txt";
        String file3 = "/Users/francisveilleux-gaboury/Documents/demo3.txt";
        CompareFiles.compareFiles(file1, file2);
        CompareFiles.compareFiles(file1, file3);
        CompareFiles.compareFiles(file2, file3);
    }

}

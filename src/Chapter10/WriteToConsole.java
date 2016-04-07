package chapter10;

import java.io.PrintWriter;

/**
 * Print to console using PrintWriter
 */
public class WriteToConsole {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Printing to console:");
        pw.print("Hello, ");
        pw.print("world!\n");
        pw.printf("%d + %d = %d", 2,3,2+3);
    }
}

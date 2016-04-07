package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates reading a file using a character stream (as opposed to a byte stream)
 */
public class ReadWithCharacterStream {
    String filePath;
    public ReadWithCharacterStream(String filePath) {
        this.filePath = filePath;
    }

    public void readFile() {
        String str;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            while((str = fileReader.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    // DEMO
    public static void main(String[] args) {
        String filePath = "/Users/francisveilleux-gaboury/Documents/random.txt";
        ReadWithCharacterStream r = new ReadWithCharacterStream(filePath);
        r.readFile();
    }
}

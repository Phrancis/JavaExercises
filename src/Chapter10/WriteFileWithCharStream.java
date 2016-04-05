package Chapter10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write to a file using a character stream
 */
public class WriteFileWithCharStream {
    private String filePath;
    public WriteFileWithCharStream(String filePath) {
        this.filePath = filePath;
    }
    public void writeFromKeyboardInput() {
        String str;
        String newLine = System.getProperty("line.separator");
        BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text to write to file.\nEnter \"stop\" to quit.");
        try(FileWriter fileWriter = new FileWriter(filePath)) {
            do {
                System.out.print("=> ");
                str = keyboardReader.readLine();
                if(str.toLowerCase().equals("stop")) {
                    break;
                }
                str += newLine;
                fileWriter.write(str);
            } while(!str.toLowerCase().equals("stop"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    // DEMO
    public static void main(String[] args) {
        String file = "/Users/francisveilleux-gaboury/Documents/random.txt";
        WriteFileWithCharStream w = new WriteFileWithCharStream(file);
        w.writeFromKeyboardInput();
        ShowFile3.showFile(file);
    }
}

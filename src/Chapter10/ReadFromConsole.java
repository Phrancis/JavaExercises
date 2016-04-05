package Chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demonstrate reading chars from console use character-based streams. (as opposed to byte streams)
 * Character streams is especially advantageous for code that will be internationalized as it uses Unicode.
 */
public class ReadFromConsole {
    public static void readChars() throws IOException {
        char ch;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, with period \".\" to finish.");
        do {
            ch = (char) reader.read();
            System.out.println(ch);
        } while(ch != '.');
    }
    public static void readStrings() throws IOException {
        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.\nEnter \"stop\" to finish.");
        do {
            str = reader.readLine();
            if(!str.toLowerCase().equals("stop")) {
                System.out.printf("You entered: \"%s\"%n", str);
            }
        } while(!str.toLowerCase().equals("stop"));
    }
    // DEMO
    public static void main(String[] args) throws IOException {
        try {
            ReadFromConsole.readChars();
            ReadFromConsole.readStrings();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

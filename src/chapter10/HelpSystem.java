package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Help System using a text file as source.
 */
public class HelpSystem {
    /**
     * Character '#' is assumed to be the line marker for titles/headers.
     */
    private final char TITLE_LINE_MARKERS = '#';

    private final String STOP_WORD = "stop";
    private final String HELP_SYSTEM_FILE_PATH = "C:/git/JavaExercises/src/chapter10/HelpSystem.txt";

    private HelpSystem() { }

    /**
     * Run the HelpSystem app.
     */
    private void run() {
        System.out.printf("Try the help system. Enter \"%s\" to end.%n", STOP_WORD);
        readTopics();
        for(String topic; !isStop(topic = getSelection()); ) {
            if (!helpOn(topic)) {
                System.out.printf("Topic not found: %s%n", topic);
            }
        }
    }

    /**
     * Reads the help topics based on the character provided as a marker for lines containing a header.
     */
    private void readTopics() {
        System.out.println("Topics:");
        try(FileReader fr = new FileReader(HELP_SYSTEM_FILE_PATH);
            BufferedReader topicReader = new BufferedReader(fr)) {
            int cursor;
            final char NOTHING = '\0';
            do {
                cursor = topicReader.read();
                if(cursor == TITLE_LINE_MARKERS) {
                    System.out.println(" - " + topicReader.readLine().replace(TITLE_LINE_MARKERS, NOTHING));
                }
            } while(cursor != -1);
        } catch(IOException exc) {
            exc.printStackTrace();
        }
    }

    /**
     * Search for a help topic entered by user.
     * @param what the help topic to search for
     * @return whether the topic is found
     */
    private boolean helpOn(String what) {
        int ch;
        String topic;
        String info;
        try (BufferedReader helpReader = new BufferedReader((new FileReader(HELP_SYSTEM_FILE_PATH)))) {
            do {
                ch = helpReader.read();
                if(ch == TITLE_LINE_MARKERS) {
                    topic = helpReader.readLine();
                    if(what.compareTo(topic) == 0) { // found topic
                        do {
                            info = helpReader.readLine();
                            if(info != null && info.compareTo("") != 0) {
                                System.out.println(info);
                            }
                        } while(info != null && info.compareTo("") != 0);
                        return true;
                    }
                }
            } while(ch != -1);
        } catch (IOException exc) {
            exc.printStackTrace();
            return false;
        }
        // topic not found:
        return false;
    }

    /**
     * Attempt to find whether the topic the user entered exists.
     * @return whether the topic the user entered exists
     */
    private String getSelection() {
        String topic = "";
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter topic: ");
        try {
            topic = inputReader.readLine();
        } catch(IOException exc) {
            exc.printStackTrace();
        }
        return topic;
    }

    /**
     * Checks if the input matches the stop word.
     * @param input the input to search for
     * @return whether the input matches the stop word
     */
    private boolean isStop(String input) {
        return input.toLowerCase().equals(STOP_WORD);
    }
    // Test the class:
    public static void main(String[] args) {
        HelpSystem help = new HelpSystem();
        help.run();
    }
}

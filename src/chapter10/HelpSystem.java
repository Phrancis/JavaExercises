package chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Help System using a text file as source.
 */
public class HelpSystem {
    private final char TITLE_LINE_MARKER = '#';
    private final String STOP_WORD = "stop";
    private final String HELP_SYSTEM_FILE_PATH = "C:/git/JavaExercises/src/chapter10/HelpSystem.txt";

    public HelpSystem() {
        run();
    }

    private void run() {
        String topic;
        System.out.printf("Try the help system. Enter \"%s\" to end.", STOP_WORD);
        readTopics();
        do {
            topic = getSelection();
            if (!isStop(topic)) {
                if (!helpOn(topic)) {
                    System.out.printf("Topic not found: %s%n", topic);
                }
            }
        } while(!isStop(topic));
    }

    private void readTopics() {
        System.out.println("Topics:");
        try(BufferedReader topicReader = new BufferedReader((new FileReader(HELP_SYSTEM_FILE_PATH)))) {
            int cursor;
            final char NOTHING = '\0';
            do {
                cursor = topicReader.read();
                if(cursor == TITLE_LINE_MARKER) {
                    System.out.println(" - " + topicReader.readLine().replace(TITLE_LINE_MARKER, NOTHING));
                }
            } while(cursor != -1);
        } catch(IOException exc) {
            exc.printStackTrace();
        }
    }

    private boolean helpOn(String what) {
        int ch = 0;
        String topic;
        String info;
        try (BufferedReader helpReader = new BufferedReader((new FileReader(HELP_SYSTEM_FILE_PATH)))) {
            do {
                ch = helpReader.read();
                if(ch == TITLE_LINE_MARKER) {
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

    private boolean isStop(String input) {
        return input.toLowerCase().equals(STOP_WORD);
    }

    public static void main(String[] args) {
        HelpSystem help = new HelpSystem();
    }
}

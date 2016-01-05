package Chapter3;

import java.util.Scanner;
import java.io.IOException;

/**
 * 3-1 Make a Java Help program for flow control structures.
 */
public class JavaControlHelp {
    public int numberOfTries = 1;
    public final int MAX_TRIES = 5;


    public JavaControlHelp() {
        startJavaControlHelp();
    }

    private void startJavaControlHelp() {
        System.out.format(
                "** Welcome to Java Control Help! **%n%n" +
                "Please choose one of the following to learn more about Java structure:%n%n"
        );
        showSelections();
    }
    private void showSelections() {
        while (numberOfTries <= MAX_TRIES) {
            System.out.format(
                    "Help on:%n" +
                            "\tA. `if` control%n" +
                            "\tB. `switch` control%n" +
                            "\tC. `for` control%n" +
                            "\tD. `while` control%n" +
                            "\tE. `do-while` control%n"
            );
            acquireSelection();
        }
    }
    private void acquireSelection() {
        char selection;
        Scanner charReader = new Scanner(System.in);
        try {
            selection = charReader.next().charAt(0);
            routeSelectionToHelpItem(selection);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    private void routeSelectionToHelpItem(char selection) {
        switch (Character.toUpperCase(selection)) {
            case 'A':
                showHelpFor_If();
                break;
            default:
                System.out.format("Selection \'%c\' was not recognized. Please try again%n", selection);
        }
        System.out.println("numberOfTries: " +numberOfTries);
        ++numberOfTries;
        showSelections();
    }

    /**
     * Help about different commands begin.
     */
    private void showHelpFor_If() {
        System.out.format(
                "`if` control structure:%n" +
                "\tif (condition) {%n" +
                "\t    //do something%n" +
                "\t} else if (a different condition) {%n" +
                "\t    //do a different thing%n" +
                "\t} else {%n" +
                "\t    //do this if no other condition matches%n" +
                "\t}%n"
        );
        //++numberOfTries;
    }

    public static void main (String[] arg) {
        JavaControlHelp jch = new JavaControlHelp();
    }
}

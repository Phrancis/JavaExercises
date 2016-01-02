package Chapter3;

import java.io.IOException;

/**
 * 3-1 Make a Java Help program for flow control structures.
 */
public class JavaControlHelp {
    private static int numberOfTries = 1;
    private static final int MAX_TRIES = 5;

    public static void startJavaControlHelp() {
        System.out.format(
                "** Welcome to Java Control Help! **%n%n" +
                "Please choose one of the following to learn more about Java structure:%n%n"
        );
        do {
            showSelections();
        } while (numberOfTries <= MAX_TRIES);
        System.exit(0);
    }

    // TODO add menu items to display
    private static void showSelections() {
        System.out.format(
                "Help on:%n" +
                "  A. `if` control%n" +
                "  B. `switch` control%n" +
                "  C. `for` control%n" +
                "  D. `while` control%n" +
                "  E. `do-while` control%n"
        );
        acquireSelection();
    }
    private static void acquireSelection() {
        char selection = ' ';
        try {
            selection = (char) System.in.read();
        }
        catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
        routeSelectionToHelpItem(selection);
    }
    // TODO implement a switch() to route to the various help items
    private static void routeSelectionToHelpItem(char selection) {
        System.out.format("routeSelectionToHelpItem%n");
        switch (selection) {
            case 'A':
                showHelpFor$If();
                break;
            default:
                System.out.format("Selection \'%c\' was not recognized. Please try again%n", selection);
                ++numberOfTries;
        }
        //acquireSelection(); //enable after there are actual selections
    }

    public static void showHelpFor$If() {
        System.out.format(
                "`if` control:%n" +
                "if (condition) {%n" +
                "    //do something%n" +
                "} else if (a different condition) {%n" +
                "    //do a different thing%n" +
                "} else {%n" +
                "    //do this if nothing else matches%n" +
                "}%n"
        );
    }

    public static void main (String[] arg) {
        startJavaControlHelp();
    }
}

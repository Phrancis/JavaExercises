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
    private static void showSelections() {
        System.out.format(
                "Help on:%n" +
                "  A. `if` control%n" +
                "  B. `switch` control%n" +
                "  C. `for` control%n" +
                "  D. `while` control%n" +
                "  E. `do-while` control%n"
        );
        ++numberOfTries;
        acquireSelection();
    }
    private static void acquireSelection() {
        char selection;
        try {
            selection = (char) System.in.read();
            routeSelectionToHelpItem(selection);
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }
    private static void routeSelectionToHelpItem(char selection) {
        //System.out.format("routeSelectionToHelpItem%n");
        switch (Character.toUpperCase(selection)) {
            case 'A':
                showHelpFor_If();
                break;
            default:
                System.out.format("Selection \'%c\' was not recognized. Please try again%n", selection);

        }
        showSelections(); //enable after there are actual selections
    }
    public static void showHelpFor_If() {
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
        ++numberOfTries;
    }

    public static void main (String[] arg) {
        startJavaControlHelp();
    }
}

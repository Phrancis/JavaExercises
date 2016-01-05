package Chapter3;

import java.util.Scanner;

/**
 * 3-1 Make a Java Help program for flow control structures.
 */
public class JavaControlHelp {
    private static Scanner charReader = new Scanner(System.in);

    public JavaControlHelp() {
        startJavaControlHelp();
    }

    private void startJavaControlHelp() {
        System.out.format(
                "** Welcome to Java Control Help! **%n%n" +
                "Please choose one of the following to learn more about Java constrol structures:%n%n"
        );
        showSelections();
    }
    private void showSelections() {
        System.out.format(
                "Help on:%n" +
                "\tA. `if/else` control%n" +
                "\tB. `switch` control%n" +
                "\tC. `for` control%n" +
                "\tD. `while` control%n" +
                "\tE. `do-while` control%n"
        );
        acquireSelection();
    }
    private void acquireSelection() {
        try {
            char selection = Character.toUpperCase(charReader.next().charAt(0));
            routeSelectionToHelpItem(selection);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    private void routeSelectionToHelpItem(char selection) {
        // TODO add methods for selections B-E
        switch (selection) {
            case 'A':
                showHelpFor_IfElse();
                break;
            case 'B':
                showHelpFor_Switch();
                break;
            default:
                System.out.format("Selection \'%c\' was not recognized. Please try again%n", selection);
        }
        lookUpAnother();
    }

    private void lookUpAnother() {
        System.out.format("Look up another one? (Y/N)%n");
        char yesOrNo = 0;
        try {
            yesOrNo = Character.toUpperCase(charReader.next().charAt(0));
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        switch (yesOrNo) {
            case 'Y':
                showSelections();
                break;
            case 'N':
                System.out.format("Goodbye.%n");
                System.exit(0);
                break;
            default:
                System.out.format("Selection \'%c\' not recognized. ", yesOrNo);
                lookUpAnother();
        }
    }

    /**
     * Methods to display information about different the different structures.
     */

    private void showHelpFor_IfElse() {
        System.out.format(
                "`if/else` control structure:%n" +
                "\tif (condition) {%n" +
                "\t    //do something%n" +
                "\t} else if (a different condition) {%n" +
                "\t    //do a different thing%n" +
                "\t} else {%n" +
                "\t    //do this if no other condition matches%n" +
                "\t}%n"
        );
    }
    private void showHelpFor_Switch() {
        System.out.format(
                "Switch control structure:%n" +
                "\tswitch (expression) {%n" +
                "\t  case X:%n" +
                "\t    //do something%n" +
                "\t    break;%n" +
                "\t  case Y:%n" +
                "\t    //do something different%n" +
                "\t    break;%n" +
                "\t  default:%n" +
                "\t    //do this if no other condition matches%n" +
                "\t}%n"
        );
    }

    public static void main (String[] arg) {
        JavaControlHelp jch = new JavaControlHelp();
    }
}

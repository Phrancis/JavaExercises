package chapter03;

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
                "Please choose one of the following to learn more about Java control structures:%n%n"
        );
        showSelections();
    }
    private void showSelections() {
        System.out.format(
                "Help on:%n" +
                "\tA. `if/else`%n" +
                "\tB. `switch`%n" +
                "\tC. `for` loop%n" +
                "\tD. `while` loop%n" +
                "\tE. `do-while loop`%n"
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
        switch (selection) {
            case 'A':
                showHelpFor_IfElse();
                break;
            case 'B':
                showHelpFor_Switch();
                break;
            case 'C':
                showHelpFor_ForLoop();
                break;
            case 'D':
                showHelpFor_WhileLoop();
                break;
            case 'E':
                showHelpFor_DoWhileLoop();
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
                "`switch` control structure:%n" +
                "\tswitch (expressionToEvaluate) {%n" +
                "\t  case valueX:%n" +
                "\t    //do something%n" +
                "\t    break;%n" +
                "\t  case valueY:%n" +
                "\t    //do something different%n" +
                "\t    break;%n" +
                "\t  default:%n" +
                "\t    //do this if no other condition matches%n" +
                "\t}%n"
        );
    }
    private void showHelpFor_ForLoop() {
        System.out.format(
                "`for` loop control structure:%n" +
                "\tfor (int i = 0; i < 10; i++) {%n" +
                "\t    //do something 10 times%n" +
                "\t}%n"
        );
    }
    private void showHelpFor_WhileLoop() {
        System.out.format(
                "`while` loop control structure:%n" +
                "\twhile (someCondition) {%n" +
                "\t    //do something while someCondition is true%n" +
                "\t}%n"
        );
    }
    private void showHelpFor_DoWhileLoop() {
        System.out.format(
                "`do-while` loop control structure:%n" +
                "\tdo {%n" +
                "\t    //do something at least once%n" +
                "\t    //and while someCondition is true%n" +
                "\t} while (someCondition)%n"
        );
    }

    public static void main (String[] arg) {
        JavaControlHelp jch = new JavaControlHelp();
    }
}

package chapter03;

public class SwitchDemo {
    static void switchWithBreaks() {
        System.out.println("\nswitchWithBreaks:");
        for (int i = 1, max = 5; i <= max; i++) {
            switch (i) {
                case 1:     System.out.println("i is 1");
                    break;
                case 2:     System.out.println("i is 2");
                    break;
                case 3:     System.out.println("i is 3");
                    break;
                default:    System.out.println("i is not 1, 2 or 3");
            }
            if (i < max) System.out.println("Next i");
        }
    }

    static void switchWithFallthrough() {
        System.out.println("\nswitchWithFallthrough");
        for (int i = 0, max = 5; i <= max; i++) {
            switch (i) {
                case 0: System.out.println("i is less than 1");
                case 1: System.out.println("i is less than 2");
                case 2: System.out.println("i is less than 3");
                case 3: System.out.println("i is less than 4");
                case 4: System.out.println("i is less than 5");
                    break;
                default: System.out.println("i is 5 or more");
            }
            if (i < max) System.out.println("Next i");
        }
    }

    static void switchWithEmptyStatements() {
        System.out.println("\nswitchWithEmptyStatements");
        for (int i = 1, max = 6; i <= max; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i is 1, 2 or 3");
                    break;
                case 4:
                case 5:
                    System.out.println("i is 4 or 5");
                    break;
                default:
                    System.out.println("i is not 1 through 5");
            }
            if (i < max) System.out.println("Next i");
        }
    }

    public static void main(String[] args) {
        switchWithBreaks();
        switchWithFallthrough();
        switchWithEmptyStatements();
    }
}

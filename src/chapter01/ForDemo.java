package chapter01;

class ForDemo {
    private static void forLoopPrintVal(int start, int stop) {
        for( ; start <= stop; start++) {
            System.out.format("The value is: %d%n", start);
        }
        System.out.println("Done!");
    }

	public static void main(String args[]) {
        forLoopPrintVal(0, 10);
	}
}
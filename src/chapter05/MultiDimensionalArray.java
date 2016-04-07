package chapter05;

class MultiDimensionalArray {
    /**Prints a 2d array with given rows and columns, with values being a 1-n count of cells*/
    private static void twoDimensionalArray(int rows, int cols) {
        int[][] table = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                table[r][c] = (r * 4) + c + 1;
                System.out.format("[%d][%d]:%d\t", r, c, table[r][c]);
                if (c == cols-1) {
                    System.out.format("%n");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.format("MultiDimensionalArray%n");
        twoDimensionalArray(3,4);
    }
}

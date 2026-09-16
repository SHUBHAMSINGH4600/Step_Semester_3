public class P1_NumberPyramidPatternPrinter {
    static void printNumberPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(4);
    }
}

public class ParallelogramPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int columns = 7; // Number of columns

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for the parallelogram shape
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= columns; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

package patternREVISION;

public class pyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the pyramid

        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= n - i; j++) { // Loop for leading spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // Loop for numbers
                System.out.print(j + " "); // Print the number based on column index
            }

            System.out.println(); // Move to the next line
        }
    }
}

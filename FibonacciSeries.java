import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of terms for the Fibonacci series:");
            int terms = scanner.nextInt();

            if (terms <= 0) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Fibonacci Series:");
                int a = 0, b = 1;
                for (int i = 1; i <= terms; i++) {
                    System.out.print(a + " ");
                    int nextTerm = a + b;
                    a = b;
                    b = nextTerm;
                }
            }
        }
    }
}
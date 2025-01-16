import java.util.*;

public class oddsum {
    // Function to calculate the sum of all odd numbers from 1 to n
    public static int oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) { // Increment by 2 to get only odd numbers
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + oddsum(n));
    }
}

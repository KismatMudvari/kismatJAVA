//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.*;

public class GCD {

    // Function to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd = calculateGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        sc.close();
    }
}

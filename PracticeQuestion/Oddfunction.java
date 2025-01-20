//Write a function to print the sum of all odd numbers from 1 to n.
package PracticeQuestion;

import java.util.*;

public class Oddfunction {
    public static int oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the sum of all odd numbers from 1 to n is " + oddsum(n));
    }
}

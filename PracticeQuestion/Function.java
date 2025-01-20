//Enter 3 numbers from the user & make a function to print their average.

package PracticeQuestion;

import java.util.*;

public class Function {
    public static int printAverage(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        System.out.print("The average of 3 numbers is :" + printAverage(a, b, c));
    }

}

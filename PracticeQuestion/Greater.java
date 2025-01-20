//Write a function which takes in 2 numbers and returns the greater of those two
package PracticeQuestion;

import java.util.*;

public class Greater {
    public static int printGreaterNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            // System.out.println(num2);
            return num2;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("the gareater among num1 and num2 is: " + printGreaterNum(num1, num2));
    }
}


//before staring this after a long time I took some time off as I had Examination on my college and Took some time off enjoying some festival along with some rituals and govermental works of mine but from now onwards I`ll again push more and more code into my git and make new projects in java programming in coming days so much yet to learn //
import java.util.*;

public class FunctionSum {
    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.println("enter the value of b: ");
            int b = sc.nextInt();
            int sum = sumOfTwo(a, b);
            System.out.println("the sum of a+b is: " + sum);
        }

    }

}

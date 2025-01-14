import java.util.*;

public class FunctionMultiple {
    public static int CalulateMultiple(int a, int b) {
        int multiple = a * b;
        return multiple;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();
            int multiple = a * b;
            System.out.println("the multiple of two number is :" + multiple);

        }
    }
}
